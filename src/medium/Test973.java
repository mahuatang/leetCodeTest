package medium;

/**
 * 没有做出来，不要陷入数组下标的循环中
 */
public class Test973 {
    public static void main(String[] args) {
       // int[][] points = new int[][]{{3,3},{5,-1},{-2,4}};
        int[][] points = new int[][]{{1, 3}, {-2, 2}};
        Test973 test973 = new Test973();
        int[][] result = test973.kClosest(points, 1);
    }

    public int[][] kClosest(int[][] points, int K) {
        int[] result = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            int length = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            result[i] = length;
        }
        quickSort(result, 0, result.length - 1);
        int destVal = result[K - 1];
        int j = 0;
        int[][] resultArray = new int[K][];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] * points[i][0] + points[i][1] * points[i][1] <= destVal && j < K) {
                resultArray[j] = points[i];
                j++;
            }
        }
        return resultArray;

    }

    public static void quickSort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int temp = 0;
        int prviot = array[(left + right) / 2];

        while(l < r) {
            while(array[r] > prviot) {
                r--;
            }

            while(array[l] < prviot) {
                l++;
            }



            if (l >= r) {
                break;
            }

            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            if (array[r] == prviot) {
                l++;
            }

            if (array[l] == prviot) {
                r--;
            }

        }

        if (l == r) {
            l++;
            r--;
        }

        if (right > l) {
            quickSort(array, l, right);
        }

        if (left < r) {
            quickSort(array, left, r);
        }


    }
}
