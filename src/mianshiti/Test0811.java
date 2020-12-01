package mianshiti;

public class Test0811 {
    public static void main(String[] args) {

    }

    public int waysToChange(int n) {
        int[] coins = new int[]{1, 5, 10, 25};

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = 1; i <= n; i++) {
                if (coin <= i) {
                    dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
                }
            }
        }

        return dp[n] % 1000000007;
    }
}
