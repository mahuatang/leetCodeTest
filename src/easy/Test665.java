package easy;

public class Test665 {
    public static boolean checkPossibility(int[] nums) {
        int i = 0,j = nums.length - 1;
        while(i < j && nums[i] <= nums[i + 1])
            i++;
        while(i < j && nums[j] >= nums[j - 1])
            j--;
        System.out.println(i + "----" + j);
        int head = 0;
        if(i == 0)
            head = Integer.MIN_VALUE;
        else
            head = nums[i - 1];
        int next = (j==nums.length - 1)?Integer.MAX_VALUE:nums[j + 1];
        if(j - i <= 1 && (head <= nums[j] || nums[i] <= next))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[]{2, 3, 3, 2, 4}));

    }

}
