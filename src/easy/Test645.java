package easy;

import java.util.Arrays;

public class Test645 {
    public static void main(String[] args) {
        int[] arrs = new int[]{1,5,3,2,2,7,6,4,8,9};
       // int[] arrs = new int[]{1, 2, 2, 4};
        Test645 test645 = new Test645();
        test645.findErrorNums(arrs);
    }

    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int repeat = 0;
        int missData = 0;
        int[] array = new int[nums.length];
        for (int i  = 0, j = 0; i < nums.length; i++, j++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                repeat = nums[i];
                i++;
            }
            array[j] = nums[i];
        }

        for (int n = 1; n <= nums.length; n++) {
            if (n != array[n-1]) {
                missData = n;
                break;
            }
        }

        int[] result = new int[]{repeat, missData};

        return result;
    }
}
