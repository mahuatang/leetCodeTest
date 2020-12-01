package easy;

public class Test459 {
    public static boolean repeatedSubstringPattern(String s) {
        for (int j = 1; j <= s.length() / 2; j++) {
            int k = j;
            String s1 = s.substring(0, k);
            boolean flag = true;
            while(k + j <= s.length()) {
                if (!s1.equals(s.substring(k, k + j))){
                    flag = false;
                    break;
                }
                k += j;
            }
            if (k == s.length() && flag) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }
}
