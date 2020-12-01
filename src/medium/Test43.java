package medium;

public class Test43 {
    public static void main(String[] args) {
        System.out.println(multiply("9133", "0"));
    }

    public static String multiply(String num1, String num2) {
        char[] numArr = num1.toCharArray();
        char[] numArr2 = num2.toCharArray();
        String[] resArr = new String[numArr.length];
        int flag = 0;
        for (int i = numArr.length - 1; i >= 0; i--) {
            int carry = 0;
            StringBuffer buffer = new StringBuffer();
            int x = i >= 0 ? numArr[i] - '0' : 0;
            int j = numArr2.length - 1;
            while(carry > 0 || j >= 0) {
                int y = j >= 0 ? numArr2[j] - '0' : 0;
                int result = x * y + carry;
                carry = result / 10;
                buffer.append(result % 10);
                j--;
            }
            int a = flag;
            buffer = buffer.reverse();
            while(a-- > 0) {
                buffer.append(0);
            }
            flag++;
            resArr[i] = buffer.toString();
        }
        String sum = resArr[0];
        for (int i = 1; i < resArr.length; i++) {
               sum = addStrings(sum, resArr[i]);
        }
        int index;
        for (index = 0; index < sum.length(); index++) {
            if (sum.charAt(index) != '0') {
                break;
            }
        }
        if (index == sum.length()) {
            return "0";
        }
        return sum.substring(index, sum.length());
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
