package easy;

public class Test1013 {
    public static void main(String[] args) {
        int[] A = new int[]{10,-10,10,-10,10,-10,10,-10};
        canThreePartsEqualSum(A);
    }

    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;

        for (int i : A) {
            sum += i;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int target = sum / 3;
        int cur = 0;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            cur += A[i];
            if (cur == target) {
                cur = 0;
                count++;
            }
        }

        return count >= 3 ? true : false;
    }
}
