package medium;

public class Test650 {
    public static void main(String[] args) {
        System.out.println(minSteps(5));

    }

    public static int minSteps(int n) {
        if (n == 1) return 0;
        int result = 0;
        int start = 1;
        int paste = 0;
        while(start < n) {
            if (start < n - start && (n - start) % start == 0) {
                paste = start;
                start += paste;
                result += 2;
            } else {
                if (paste == 0) {
                    paste = start;
                    result++;
                }
                start += paste;
                result++;
            }
        }

        return result;
    }
}
