package easy;

import medium.Test912;

import java.util.Arrays;

public class Test976 {
    public static void main(String[] args) {
        int[] A = new int[]{3,2,6,8,1,10};
        Test976 test976 = new Test976();
        test976.largestPerimeter(A);
    }

    public int largestPerimeter(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        int num1 = A[A.length - 1];
        int num2 = A[A.length - 2];
        int num3 = A[A.length - 3];

        if (isRight(num1, num2, num3)) {
            return num1 + num2 + num3;
        }

        for (int i = A.length - 4; i >= 0; i--) {
            num1 = num2;
            num2 = num3;
            num3 = A[i];
            if (isRight(num1, num2, num3)) {
                return num1 + num2 + num3;
            }
        }
        return 0;
    }

    public boolean isRight(int num1, int num2, int num3) {
        return num2 + num3 <= num1 ? false : true;
    }
}
