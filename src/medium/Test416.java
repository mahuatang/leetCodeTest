package medium;

public class Test416 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 11, 5};
        canPartition2(arr);
    }


    /**
     * 假如dp[i - num]为true，则表示在num之前的数组可以找出和为i - num的集合，那么再加入了num之 后，数组也能找出和为i的集合，于是dp[i]更新为true。
     * @param nums
     * @return
     */
    public static boolean canPartition2(int[] nums) {
       int sum = 0;
       for (int i : nums) {
           sum += i;
       }

       if (sum % 2 != 0) {
           return false;
       }

       int target = sum / 2;
       boolean[] dp = new boolean[target + 1];
       dp[0] = true;

       for (int i : nums) {
           for (int j = target; j >= i; j--) {
               if (dp[j - i] == true) {
                   dp[j] = true;
               }
           }
       }
       return dp[target];
    }



    public static boolean canPartition(int[] nums) {
        //转化为经典的01背包问题
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 == 1)
            return false;
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        //建立dp数组，dp[i]表示能否找到和为i的数组元素集合
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (dp[i - num] == true)
                    dp[i] = true;
            }
        }
        return dp[target];
    }
}
