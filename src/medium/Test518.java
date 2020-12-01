package medium;

public class Test518 {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = new int[]{1, 5};
        int i = change(amount, coins);
        System.out.println();
    }

    public static int change(int amount, int[] coins) {

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (i >= coin) {
                    dp[i] += dp[i - coin];
                }
            }
        }

        return dp[amount];
    }

    public static int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }

        int[] arr = new int[amount + 1];
        arr[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++)
                if (i - coins[j] >= 0 && arr[i - coins[j]] < min) {
                    min = arr[i - coins[j]] + 1;
                }
            arr[i] = min;
        }
        return arr[amount] == Integer.MAX_VALUE ? -1 : arr[amount];
    }
}
