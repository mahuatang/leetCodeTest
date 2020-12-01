package easy;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 */
public class Test122 {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        //int[] prices = new int[]{1,2,3,4,5};
        Test122 test122 = new Test122();
        test122.maxProfit(prices);
    }

    public int maxProfit(int[] prices) {
        int start = -1;
        int sum = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (start == -1 && prices[i] < prices[i + 1]) {
                start = i;
            }
            if (start != -1 && prices[i] > prices[i + 1]) {
                sum += prices[i] - prices[start];
                start = -1;
            }
            if (i == prices.length - 2 && start != -1) {
                sum += prices[i + 1] - prices[start];
            }
        }
        return sum;
    }
}
