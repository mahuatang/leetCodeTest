package easy;

import java.util.Arrays;

public class Test204 {
    public static void main(String[] args) {
        System.out.println(countPrimes2(10));
    }

    public static int countPrimes(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        int count = 1;
        for (int i = 3; i < n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            boolean flag = true;
            for (int j = 3; j * j <= i; j += 2) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static int countPrimes2(int n) {
        boolean[] nums = new boolean[n];
        Arrays.fill(nums, true);
        for (int i = 2; i * i < n; i++) {
            if (nums[i]) {
                for (int j = i * i; j < n; j += i)
                    nums[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i]) {
                count++;
            }
        }
        return count;
    }
}
