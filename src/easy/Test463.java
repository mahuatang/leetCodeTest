package easy;

/**
 * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
 *
 * 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 *
 * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
 */
public class Test463 {
    public static void main(String[] args) {
        //int[][] array = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0},{1,1,0,0}};
        //int[][] array = {{1}, {0}};
        //int[][] array = {{1, 1, 1}, {1, 0, 1}};
        int[][] array = {{0, 1}, {1, 1}, {1, 0}};
        Test463 test463 = new Test463();
        test463.islandPerimeter(array);
    }

    public int islandPerimeter(int[][] grid) {
        int upLength = 0;
        int result = 0;
        int[] beforeArray = null;

        for(int[] array : grid) {
            int sum = 0;
            for (int i : array) {
                sum += i;
            }
            if (sum == 0) {
                continue;
            }
            if (upLength == 0) {
                upLength = sum;
                result += sum * 4 - getArrayConnect(array) * 2;
                beforeArray = array;
            } else {
                upLength = getArrayLength(beforeArray, array);
                result += sum * 4 - getArrayConnect(array) * 2 - upLength * 2;
                beforeArray = array;
            }
        }
        return result;
    }

    public int getArrayLength(int[] array1, int[] array2) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1 && array1[i] == array2[i]) {
                sum++;
            }
        }
        return sum;
    }

    public int getArrayConnect(int[] array) {
        int length = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 1 && array[i] == array[i + 1]) {
                length++;
            }
        }
        return length;
    }
}
