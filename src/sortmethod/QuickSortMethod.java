package sortmethod;

public class QuickSortMethod {
    public static void main(String[] args) {
        int[] aa = new int[]{8, 5, 2, 3, 11, 2, 6};
        quickSortMethod(aa, 0, aa.length - 1);
        System.out.println();
    }

    public static void quickSortMethod(int[] nums, int start, int end) {
       int l = start;
       int r = end;
       int middle = nums[(start + end) / 2];

       while(l < r) {
            while(nums[l] < middle) {
                l++;
            }

            while (nums[r] > middle) {
                r--;
            }

            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            if (l >= r) {
                break;
            }

            if (nums[r] == middle) {
                l++;
            }

            if (nums[l] == middle) {
                r--;
            }
       }

       if (l == r) {
           l++;
           r--;
       }

       if (end > l) {
           quickSortMethod(nums, l, end);
       }

       if (start < r) {
           quickSortMethod(nums, start, r);
       }
    }
}
