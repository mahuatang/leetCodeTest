package mianshiti;

public class Test43 {
    public static void main(String[] args) {
        Test43 test43 = new Test43();
        int n = test43.countDigitOne(1234);
        System.out.println(n);
    }

    public int countDigitOne(int n) {
        if (n <= 0) {
            return 0;
        }

        String str = String.valueOf(n);
        int hign = str.charAt(0) - '0';
        int pow = (int)(Math.pow(10, str.length() - 1));
        int last = n - hign * pow;

        if (hign == 1) {
            return countDigitOne(pow - 1) + last + 1 + countDigitOne(last);
        } else {
            return hign * countDigitOne(pow - 1) + countDigitOne(last) + pow;
        }

    }
}
