package easy;

public class Test482 {
    public static void main(String[] args) {
       // System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
        System.out.println(licenseKeyFormatting("---", 3));
    }

    public static String licenseKeyFormatting(String S, int K) {
        S = new StringBuffer(S).reverse().toString();
        S = S.replace("-", "").toUpperCase();
        if (S.length() == 0) {
            return "";
        }
        String result = "";
        int i = 0;
        for(; (i + 1) * K <= S.length(); i++) {
            result += S.substring(i * K, (i + 1) * K) + "-";
        }
        if (i * K == S.length()) {
            result = result.substring(0, result.length() - 1);
        } else {
            result += S.substring(i * K, S.length());
        }

        result = new StringBuffer(result).reverse().toString();
        return result;
    }
}
