package easy;

import java.util.ArrayList;
import java.util.List;

public class LCP22 {
    public static void main(String[] args) {
        int a = paintingPlan(1, 1);
        //System.out.println();
        //System.out.println(getwokao(3, 9));
    }

    public static int paintingPlan(int n, int k) {
        if (k == 0) {
            return 1;
        }
        if (n > k) {
            return 0;
        }
        if (n == k) {
            if (k == 1) {
                return 1;
            }
            return n * 2;
        }
        if (n * n == k) {
            return 1;
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i <= k / n; i++) {
            for (int j = 0; i < n && j <= k / (n - i); j++) {
                if (i * n + j * (n - i) == k) {
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = j;
                    list.add(arr);
                }
            }
        }

        if (n == k) {
            return 1;
        }

        int result = 0;
        for (int[] a : list) {
            int x = a[0];
            int y = a[1];
            if (x == 0) {
                result += getwokao(y, n) * 2;
            } else if (y == 0) {
                result += getwokao(x, n) * 2;
            } else {
                result += getwokao(x, n) * getwokao(y, n);
            }
        }

        return result;
    }

    public static int getwokao(int x, int y) {
        int result = 1;
        int result2 = 1;
        while(x > 0) {
            result *= y;
            result2 *= x;
            y--;
            x--;
        }
        return result / result2;
    }
}
