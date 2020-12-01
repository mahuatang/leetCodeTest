package medium;

import java.util.Arrays;

public class Test300 {
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,4};
        lengthOfLIS(nums);
    }

    public static int lengthOfLIS(int[] nums) {
        int cur = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            if (cur < dp[i]) {
                cur = dp[i];
            }
        }
        return cur;
    }
}
