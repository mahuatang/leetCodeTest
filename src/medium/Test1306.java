package medium;

public class Test1306 {
    public static void main(String[] args) {
    }

    public boolean canReach(int[] arr, int start) {
        int start1 = start + arr[start];
        int start2 = start - arr[start];

        if (arr[start] == 0) {
            return true;
        } else {
            arr[start] = -1;
        }

        if (search(start1, arr)) {
            return true;
        }

        if (search(start2, arr)) {
            return true;
        }

        return false;
    }

    public boolean search(int val, int[] arr) {
        if (val >= 0 && val <= arr.length - 1 && arr[val] >= 0) {
            if (arr[val] == 0) {
                return true;
            }

            boolean flag = canReach(arr, val);
            if (flag) {
                return true;
            }
        }

        return false;
    }
}
