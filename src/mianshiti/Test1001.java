package mianshiti;

public class Test1001 {
    public static void main(String[] args) {

    }

    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = m; i < m + n; i++) {
            A[i] = B[i - m];
        }

        int start = 0;
        int end = A.length - 1;

        haha(A, start, end);
    }

    public void haha(int[] arr, int start, int end) {
        int l = start;
        int r = end;

        int provit = arr[(l + r) / 2];

        while(l < r) {
            while(arr[r] > provit) {
                r--;
            }

            while(arr[l] < provit) {
                l++;
            }

            if (l >= r) {
                break;
            }

            arr[l] ^= arr[r];
            arr[r] ^= arr[l];
            arr[l] ^= arr[r];

            if (arr[r] == provit) {
                l++;
            }

            if (arr[l] == provit) {
                r--;
            }
        }

        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if(start < r) {
            haha(arr, start, r);
        }
        //向右递归
        if(end > l) {
            haha(arr, l, end);
        }
    }
}
