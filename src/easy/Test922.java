package easy;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 */
public class Test922 {
    public static void main(String[] args) {

    }

    public int[] sortArrayByParityII(int[] A) {
        int[] B = new int[A.length];
        int j = 0;
        int k = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[j] = A[i];
                j += 2;
            } else {
                B[k] = A[i];
                k += 2;
            }
        }
        return B;
    }
}
