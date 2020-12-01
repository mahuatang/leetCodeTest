package mianshiti;

public class Test49 {
    public static void main(String[] args) {
        nthUglyNumber(10);
    }

    public static int nthUglyNumber(int n) {
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        int[] haha = new int[n + 1];
        haha[0] = 1;

        for (int i = 1; i <= n; i++) {
            haha[i] = Math.min(haha[p2] * 2, Math.min(haha[p3] * 3, haha[p5] * 5));

            if (haha[i] == haha[p2] * 2) p2++;
            if (haha[i] == haha[p3] * 3) p3++;
            if (haha[i] == haha[p5] * 5) p5++;
        }

        return haha[n - 1];
    }
}
