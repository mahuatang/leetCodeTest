package easy;

import java.util.LinkedList;
import java.util.List;

public class Test121 {

    /**
     *
     *优秀解法：
     *贪心算法，从左向右，维护一个最小值low，与每一天的股票价格做差，差最大的为答案
     * public int maxProfit(int[] prices) {
     *         int maxP = 0;
     *         int low = Integer.MAX_VALUE;
     *         for(int p : prices) {
     *             if(p < low) {
     *                 low = p;
     *             }
     *             maxP = Math.max(maxP, p - low);
     *         }
     *         return maxP;
     *     }
     *
     *
     */





    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        List<Integer> list = new LinkedList<>();
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            max = prices[i + 1];
            for (int j = i + 1; j < prices.length; j++) {
                if (max < prices[j]) max = prices[j];
            }

            if(max2 < (max - prices[i])) {
                max2 = max - prices[i];
            }
        }

        if (max2 < 0) {
            return 0;
        }

        return max2;

    }
}
