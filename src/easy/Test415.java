package easy;

public class Test415 {
    public static void main(String[] args) {
        System.out.println(addStrings("80", "8"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuffer buffer = new StringBuffer();
        char[] numArray1 = num1.toCharArray();
        char[] numArray2 = num2.toCharArray();
        int i = numArray1.length - 1;
        int j = numArray2.length - 1;
        int carry = 0;
        int result = 0;
        while(i >= 0 || j >= 0 || carry > 0) {
            int x = i < 0 ? 0 : numArray1[i--] - '0';
            int y = j < 0 ? 0 : numArray2[j--] - '0';
            result = x + y + carry;
            buffer.append(result % 10);
            carry = result / 10;
        }
        return buffer.reverse().toString();
    }
}
