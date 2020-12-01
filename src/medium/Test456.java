package medium;

public class Test456 {
    public static void main(String[] args) {
        System.out.println(find132pattern(new int[]{1,0,1,-4,-3}));
    }

    public static boolean find132pattern(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int minLeft = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (minLeft > nums[i - 1]) minLeft = nums[i - 1];
            if (nums[i] < minLeft) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j] && minLeft < nums[j]) return true;
            }
        }
        return false;
    }
}
