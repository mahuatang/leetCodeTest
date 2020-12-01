package easy;

public class Test643 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 4, 2};
        double result = findMaxAverage(arr, 4);
        System.out.println(result);
    }

    public static double findMaxAverage(int[] nums, int k) {
        double max = -100000.0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (i + k <= nums.length ) {
                for (int j = i + 1; j < i + k; j++) {
                    sum += nums[j];
                }
                if (max < sum / (k * 1.00)) {
                    max = sum / (k * 1.00);
                }
            }
        }

        return max;
    }
}
