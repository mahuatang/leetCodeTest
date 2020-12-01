package easy;

public class Test1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] dest = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    dest[0] = i;
                    dest[1] = j;
                    break;
                }
            }
        }

        return dest;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 8, 10, 20};
        int target = 4;

        int[] dest = twoSum(nums, target);
        System.out.println(dest[0] + " : " + dest[1]);
    }
}
