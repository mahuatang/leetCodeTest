package easy;

/**
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
 *
 * 我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 *
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-pivot-index
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Test724 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int wokao = solution.pivotIndex(new int[]{-1, -1, 0, 1, 1, 0});
        System.out.println("值为：" + wokao);
    }

}

class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        } else if (nums.length == 1) {
            return nums[0];
        }

        int flag = -1;
        for (int i = 0; i <= nums.length - 1; i++) {
            int sum1 = 0;
            if (i == 0) {
                getSum(nums, 0, 0);
            } else {
                sum1 = getSum(nums, 0, i-1);
            }
            int sum2 = getSum(nums, i + 1, nums.length - 1);
            if (sum1 == sum2) {
                flag = i;
                break;
            }
        }
        return flag;
    }

    public int getSum(int[] nums, int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += nums[i];
        }
        return result;
    }
}
