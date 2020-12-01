package easy;

/**
 * 摩尔投票法
 * public int majorityElement(int[] nums) {
 *         int cand_num = nums[0], count = 1;
 *         for (int i = 1; i < nums.length; ++i) {
 *             if (cand_num == nums[i])
 *                 ++count;
 *             else if (--count == 0) {
 *                 cand_num = nums[i];
 *                 count = 1;
 *             }
 *         }
 *         return cand_num;
 *     }
 *
 */

public class Test169 {
    public static void main(String[] args) {
        int[] cc = new int[]{6, 5, 5};
        majorityElement(cc);
    }

    public static int majorityElement(int[] nums) {
        int hh = nums.length / 2 + 1;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count >= hh) {
                return nums[i];
            }
        }

        return 0;
    }
}
