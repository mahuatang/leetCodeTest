package easy;

/**
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 *
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 *
 * A.length >= 3
 * 在 0 < i < A.length - 1 条件下，存在 i 使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 */
public class Test941 {
    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 2) {
            return false;
        }
        if (A[0] >= A[1]) {
            return false;
        }
        int middle = -1;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                return false;
            } else if (A[i] > A[i + 1]) {
                if (middle == -1) {
                    middle = i;
                }
            } else {
                if (middle > 0) {
                    return false;
                }
            }
        }
        return middle == -1 ? false : true;
    }
}
