package medium;

import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
      //  int result = threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
      //  int result = threeSumClosest(new int[]{0, 2, 1, -3}, 1);
        int result = threeSumClosest(new int[]{1, 2, 5, 10, 11}, 12);
        System.out.println("hh");
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;

        int min = nums[0] + nums[1] + nums[nums.length - 1] - target;

        for (int i = 0; i < len; i++) {
            int l = i + 1;
            int e = len - 1;

            while(l < e) {
                sum = nums[i] + nums[l] + nums[e] - target;
                if (sum == 0) {
                    return nums[i] + nums[l] + nums[e];
                } else if (sum > 0) {
                    e--;
                } else {
                    l++;
                }
                if (Math.abs(min) > Math.abs(sum)) {
                    min = sum;
                }
            }
        }

        return min + target;
    }
}
