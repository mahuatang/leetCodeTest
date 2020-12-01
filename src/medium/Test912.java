package medium;

public class Test912 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 3, 1};

        int[] haha = sortArray(arr);
        System.out.println();
    }

    public static int[] sortArray(int[] nums) {
        /*for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] ^= nums[j + 1];
                    nums[j + 1] ^= nums[j];
                    nums[j] ^= nums[j + 1];
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }

        return nums;*/
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quickSort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int temp = 0;
        int prviot = array[(left + right) / 2];

        while(l < r) {
            while(array[r] > prviot) {
                r--;
            }

            while(array[l] < prviot) {
                l++;
            }



            if (l >= r) {
                break;
            }

            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            if (array[r] == prviot) {
                l++;
            }

            if (array[l] == prviot) {
                r--;
            }

        }

        if (l == r) {
            l++;
            r--;
        }

        if (right > l) {
            quickSort(array, l, right);
        }

        if (left < r) {
            quickSort(array, left, r);
        }


    }

    public static void quickSort2(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int temp = 0;
        int prviot = array[(left + right) / 2];

        while(l < r) {
            while(array[r] < prviot) {
                r--;
            }

            while(array[l] > prviot) {
                l++;
            }



            if (l >= r) {
                break;
            }

            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            if (array[r] == prviot) {
                l++;
            }

            if (array[l] == prviot) {
                r--;
            }

        }

        if (l == r) {
            l++;
            r--;
        }

        if (right > l) {
            quickSort2(array, l, right);
        }

        if (left < r) {
            quickSort2(array, left, r);
        }


    }
}
