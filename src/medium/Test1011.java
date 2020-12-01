package medium;

public class Test1011 {
    public static void main(String[] args) {
        int[] weight = new int[]{1,2,3,4,5,6,7,8,9,10};
        int D = 5;

        Test1011 test1011 = new Test1011();
     //   int i = test1011.shipWithinDays(weight, D);

        test1011.canShip(weight, 14, 5);
        System.out.println();

    }

    public int shipWithinDays(int[] weights, int D) {
        int lo = 0;
        int hi = Integer.MAX_VALUE;
        int mid = 0;

        while (lo <= hi) {
            mid = (hi + lo) / 2;

            if (mid == 15) {
                System.out.println();
            }

            if (canShip(weights, mid, D)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    public boolean canShip(int[] weights, int k, int D) {
        int cur = k;
        for (int weight : weights) {
            if(weight > k) return false;
            if (cur < weight) {
                cur = k - weight;
                D--;
                continue;
            }
            cur -= weight;
        }

        return D > 0;
    }
}
