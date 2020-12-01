package easy;


/**
 * 好的解法，辗转相除法
 *
 *public String gcdOfStrings(String str1, String str2) {
 *         // 假设str1是N个x，str2是M个x，那么str1+str2肯定是等于str2+str1的。
 *         if (!(str1 + str2).equals(str2 + str1)) {
 *             return "";
 *         }
 *         // 辗转相除法求gcd。
 *         return str1.substring(0, gcd(str1.length(), str2.length()));
 *     }
 *
 *     private int gcd(int a, int b) {
 *         return b == 0? a: gcd(b, a % b);
 *     }
 *
 *
 * //上面不容易理解，简单版的辗转相除法
 private int gcd(int a, int b){
 while(b != 0){
 int tmp = b;
 b = a%b;
 a = tmp;
 }
 return a;
 }
 */
public class Test1071 {
    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        String haha = gcdOfStrings(str1, str2);
        System.out.println();
    }

    public static String gcdOfStrings(String str1, String str2) {
        String target = str1.length() > str2.length() ? str2 : str1;
        String other =  str1.length() > str2.length() ? str1 : str2;

        if (!other.contains(target)) {
            return "";
        }

        String vava = target;

        while(target.length() > 0) {
            if (isVal(other, target) && isVal(vava, target)) {
                return target;
            }
            target = target.substring(0, target.length() - 1);
        }
        return "";
    }

    public static boolean isVal(String other, String target) {
        int length = target.length();
        for (int i = 0; i < other.length(); i+=length) {
            if (i + length > other.length()) return false;
            String str = other.substring(i, i + length);
            if (target.equals(str)) {
                if (i + length == other.length()) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }


}
