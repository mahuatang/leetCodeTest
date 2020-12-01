package medium;

public class Test322 {

    public static void main(String[] args) {
        /*int[] arr = new int[]{186,419,83,408};
        System.out.println(coinChange(arr, 6249));*/
        int amount = 5;
        int[] coins = new int[]{1, 5};
        int i = coinChange(coins, amount);
        System.out.println();
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
