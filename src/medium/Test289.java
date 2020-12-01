package medium;

public class Test289 {
    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        Test289 test289 = new Test289();
        test289.gameOfLife(board);

    }

    public void gameOfLife(int[][] board) {
        int[][] copy = new int[board.length][board[0].length];

        for (int m = 0; m < board.length; m++) {
            for (int n = 0; n < board[0].length; n++) {
                copy[m][n] = board[m][n];
            }
        }

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[0].length; j++) {
                int liveNumber = countNumber(copy, i, j);
                if (copy[i][j] == 0 && liveNumber == 3) {
                    board[i][j] = 1;
                }
                if (copy[i][j] == 1 && (liveNumber > 3 || liveNumber < 2)) {
                    board[i][j] = 0;
                }
            }
        }
    }

    public int countNumber(int[][] board, int i, int j) {
        int count = 0;
        int length = board[0].length;
        if (i - 1 >= 0 && j - 1 >= 0 && board[i-1][j-1] == 1) {
            count++;
        }
        if (i - 1 >= 0 && board[i-1][j] == 1) {
            count++;
        }
        if (i - 1 >= 0 && j + 1 < length  && board[i-1][j+1] == 1) {
            count++;
        }
        if (j - 1 >=0 && board[i][j-1] == 1) {
            count++;
        }
        if (j + 1 <length && board[i][j+1] == 1) {
            count++;
        }
        if (i + 1 < board.length && board[i+1][j] == 1) {
            count++;
        }
        if (i + 1 < board.length && j-1>=0 && board[i+1][j-1] == 1) {
            count++;
        }
        if (i + 1 < board.length && j+1<length && board[i+1][j+1] == 1) {
            count++;
        }
        return count;
    }

}
