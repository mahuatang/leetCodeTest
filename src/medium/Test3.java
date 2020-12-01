package medium;

public class Test3 {
    public static void main(String[] args) {
       // String str = "abcabcbb";
        String str = "abcabcbb";
        Test3 test3 = new Test3();

        System.out.println(test3.lengthOfLongestSubstring(str));

        System.out.println("h");
      //  kmpNext(str);
    }

    public int lengthOfLongestSubstring(String s) {
        String maxStr = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            int repeatindex = maxStr.indexOf(curChar);
            if (repeatindex > -1) {
                if (maxLength < maxStr.length()) {
                    maxLength = maxStr.length();
                }
                maxStr = maxStr.substring(repeatindex + 1, maxStr.length()) + curChar;
            } else {
                maxStr += curChar;
            }
        }

        return Math.max(maxStr.length(), maxLength);
    }

    public int isRepeat(char c, String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (c == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }


    public int lengthOfLongestSubstring2(String s) {
        int l = 0;
        int [] dp = new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.substring(l,i).indexOf(s.charAt(i))!=-1)
                l = s.indexOf(s.charAt(i), l)+1;
            dp[i+1] = Math.max(dp[i], i-l+1);
        }
        return dp[s.length()];
    }
}
