package easy;

public class Test263 {
    public static void main(String[] args) {
        Test263 test263 = new Test263();
    }

    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        while(num != 1) {
            boolean flag = true;

            if (num % 3 == 0) {
                num /= 3;
                flag = false;
            }

            if (num % 2 == 0) {
                num /= 2;
                flag = false;
            }

            if (num % 5 == 0) {
                num /= 5;
                flag = false;
            }

            if (flag) {
                return false;
            }
        }
        return true;
    }
}
