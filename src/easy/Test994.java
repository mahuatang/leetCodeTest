package easy;

public class Test994 {
    public static void main(String[] args) {

        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        Test994 test994 = new Test994();
        test994.orangesRotting(grid);

    }

    public int orangesRotting(int[][] grid) {
        boolean flag = true;
        int count = 0;
        int[][] help = copyArray(grid);

        while(flag) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 2) {
                        if (i - 1 >=0 && grid[i - 1][j] == 1) {
                            help[i - 1][j] = 2;
                            flag = false;
                        }

                        if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                            help[i + 1][j] = 2;
                            flag = false;
                        }

                        if (j - 1 >=0 && grid[i][j - 1] == 1) {
                            help[i][j - 1] = 2;
                            flag = false;
                        }

                        if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                            help[i][j + 1] = 2;
                            flag = false;
                        }

                    }
                }
            }

            if (flag) {
                break;
            }

            count++;
            flag = true;

            grid = copyArray(help);
        }

        for (int m = 0; m < grid.length; m++) {
            for (int n = 0; n < grid[m].length; n++) {
                if (grid[m][n] == 1) {
                    return -1;
                }
            }
        }

        return count;
    }


    public int[][] copyArray(int[][] grid) {
        int[][] help = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                help[i][j] = grid[i][j];
            }
        }

        return help;
    }
}
