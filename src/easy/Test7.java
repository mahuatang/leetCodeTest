package easy;

public class Test7 {
    public static long reverse(int x) {
        long rev = 0;

        if (x < (Math.pow(-2, 31)) || x > (Math.pow(2, 31) - 1)) {
            return 0;
        }

        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }

        if(x < 0) rev = -rev;

        if (rev < (Math.pow(-2, 31)) || rev > (Math.pow(2, 31) - 1)) {
            return 0;
        }

        return (int)rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(134123491));

        /*System.out.println(Math.pow(-2, 31));
        System.out.println(Math.pow(2, 31) - 1);*/
    }
}
