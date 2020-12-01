package easy;

public class Test747 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 0, 1};
        dominantIndex(arr);
    }

    public static int dominantIndex(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }

        int max = nums[0];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i != index && nums[i] * 2 > max) {
                return -1;
            }
        }
        return index;
    }
}
