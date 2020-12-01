package medium;

public class Test75 {
    public static void main(String[] args) {
        int[] array = new int[]{2,6,3,1,12,16,9};
        sortColors(array);
    }

    public static void sortColors(int[] nums) {
        Test912.quickSort(nums, 0, nums.length - 1);
        System.out.println();
    }
}
