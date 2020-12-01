package easy;

public class Test1365 {
    public static void main(String[] args) {

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    sum++;
                }
            }
            result[i] = 0;
        }
        return result;
    }
}
