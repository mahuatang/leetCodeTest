package easy;

import java.util.Arrays;

/**
 * 相对顺序，不能排序
 */

/**
 * 题解1：
 *   public void moveZeroes(int[] nums) {
 *         int i = 0;
 *         for (int j = 0; j < nums.length; j++) {
 *             //只要不为0就往前挪
 *             if (nums[j] != 0) {
 *                 //i指向的值和j指向的值交换
 *                 int temp = nums[i];
 *                 nums[i] = nums[j];
 *                 nums[j] = temp;
 *
 *                 i++;
 *             }
 *         }
 *     }
 *
 * 题解2：
 *  public void moveZeroes(int[] nums) {
 *         if (nums == null || nums.length == 0)
 *             return;
 *         int index = 0;
 *         //一次遍历，把非零的都往前挪
 *         for (int i = 0; i < nums.length; i++) {
 *             if (nums[i] != 0)
 *                 nums[index++] = nums[i];
 *         }
 *         //后面的都是0,
 *         while (index < nums.length) {
 *             nums[index++] = 0;
 *         }
 *     }
 *
 */
public class Test283 {

    public static void main(String[] args) {
        Test283 test283 = new Test283();
        //int[] nums = new int[]{0,1,0,3,12,-2};
        int[] nums = new int[]{1,2,0,0};
        test283.moveZeroes(nums);

    }

    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;
            }
        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - k - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - k - 1] = 0;
                k++;
                if (k == count){
                    break;
                }
                i--;
            }
        }
        System.out.println();
    }

    /*public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (Math.abs(nums[j]) < Math.abs(nums[j + 1])) {
                    nums[j] ^= nums[j + 1];
                    nums[j + 1] ^= nums[j];
                    nums[j] ^= nums[j + 1];
                }
            }
        }
    }

    public void bubbleSort2(int[] nums, int flag) {
        int size = flag;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] ^= nums[j + 1];
                    nums[j + 1] ^= nums[j];
                    nums[j] ^= nums[j + 1];
                }
            }
        }
    }*/
}
