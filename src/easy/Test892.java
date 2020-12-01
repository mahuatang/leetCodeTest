package easy;

public class Test892 {
    public static void main(String[] args) {
        int[][] grid = {{1,0},{0,2}};
        int sum = surfaceArea(grid);
        System.out.println(sum);
    }

    public static int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                int value =  grid[i][j] * 4 + 2;

                if (i + 1 < grid.length) {
                    value -= Math.min(grid[i + 1][j], grid[i][j]);
                }

                if (j + 1 < grid.length) {
                    value -= Math.min(grid[i][j], grid[i][j + 1]);
                }
                if (i - 1 >= 0) {
                    value -= Math.min(grid[i - 1][j], grid[i][j]);
                }

                if (j - 1 >= 0) {
                    value -= Math.min(grid[i][j - 1], grid[i][j]);
                }
                sum += value;
            }
        }
        return sum;
    }
}
