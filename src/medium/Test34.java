package medium;

/**
 * 优秀解法：可以使用二分查找，一次查左边界，一次查有边界
 *
 public int[] searchRange(int[] nums, int target) {
 return new int[] {findLeft(nums, target), findRight(nums, target)};
 }

 private int findLeft(int[] nums, int target) {
 int lo = 0, hi = nums.length - 1, index = -1;
 while (lo <= hi) {
 int mid = lo + ((hi - lo) >> 1);
 if (nums[mid] < target) lo = mid + 1;
 else hi = mid - 1;
 if (nums[mid] == target) index = mid;
 }
 return index;
 }

 private int findRight(int[] nums, int target) {
 int lo = 0, hi = nums.length - 1, index = -1;
 while (lo <= hi) {
 int mid = lo + ((hi - lo) >> 1);
 if (nums[mid] <= target) lo = mid + 1;
 else hi = mid - 1;
 if (nums[mid] == target) index = mid;
 }
 return index;
 }
 */
public class Test34 {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 10};
        Test34 test34 = new Test34();

        int[] a = test34.searchRange(nums, 8);
        System.out.println();

    }

    /**
     * nums = [5,7,7,8,8,10], target = 8
     * 输出：[3,4]
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] result = new int[2];
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && start == -1) {
                start = i;
            }
            if (nums[nums.length - 1 - i] == target && end == -1) {
                end = nums.length - 1 - i;
            }
        }
        if (start == -1 && end != -1) {
            start = end;
        }
        if (start != -1 && end == -1) {
            end = start;
        }
        result[0] = start;
        result[1] = end;
        return result;
    }
}
