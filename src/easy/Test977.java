package easy;

public class Test977 {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (B[j] > B[j + 1]) {
                    int temp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = temp;
                }
            }
        }
        return B;
    }
}
