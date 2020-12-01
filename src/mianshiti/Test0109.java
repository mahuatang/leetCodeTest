package mianshiti;



/**优秀写法：将字符串dubbo直接看是否包含
 * public boolean isFlipedString(String s1, String s2)
 *     {
 *         if(s1.length()!=s2.length())return false;
 *         if(s1.equals(s2))return true;
 *         s1+=s1;
 *         return s1.contains(s2);
 *     }
 *
 */
public class Test0109 {
    public static void main(String[] args) {

        String s1 = "";
        String s2 = "";
        isFlipedString(s1, s2);
    }

    public static boolean isFlipedString(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1 != null && s2 != null && s1.length() != s2.length()) {
            return false;
        }

        if (s1.length() == 0 && s2.length() == 0)  {
            return true;
        }

        for (int i = 0; i < s1.length(); i++) {
            String str = s1.substring(i, s1.length()) + s1.substring(0, i);
            if (str.equals(s2)) {
                return true;
            }
        }

        return false;
    }
}
