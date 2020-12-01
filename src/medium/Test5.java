package medium;

/**
 * 考虑使用动态规划算法（笔记有网页链接）
 */
public class Test5 {
    public static void main(String[] args) {
        String str = "cbbd";
    //    String str = "lcnvoknqgejxbfhijmxglisfzjwbtvhodwummdqeggzfczmetrdnoetmcydwddmtubcqmdjwnpzdqcdhplxtezctvgnpobnnscrmeqkwgiedhzsvskrxwfyklynkplbgefjbyhlgmkkfpwngdkvwmbdskvagkcfsidrdgwgmnqjtdbtltzwxaokrvbxqqqhljszmefsyewwggylpugmdmemvcnlugipqdjnriythsanfdxpvbatsnatmlusspqizgknabhnqayeuzflkuysqyhfxojhfponsndytvjpbzlbfzjhmwoxcbwvhnvnzwmkhjxvuszgtqhctbqsxnasnhrusodeqmzrlcsrafghbqjpyklaaqximcjmpsxpzbyxqvpexytrhwhmrkuybtvqhwxdqhsnbecpfiudaqpzsvfaywvkhargputojdxonvlprzwvrjlmvqmrlftzbytqdusgeupuofhgonqoyffhmartpcbgybshllnjaapaixdbbljvjomdrrgfeqhwffcknmcqbhvulwiwmsxntropqzefwboozphjectnudtvzzlcmeruszqxvjgikcpfclnrayokxsqxpicfkvaerljmxchwcmxhtbwitsexfqowsflgzzeynuzhtzdaixhjtnielbablmckqzcccalpuyahwowqpcskjencokprybrpmpdnswslpunohafvminfolekdleusuaeiatdqsoatputmymqvxjqpikumgmxaxidlrlfmrhpkzmnxjtvdnopcgsiedvtfkltvplfcfflmwyqffktsmpezbxlnjegdlrcubwqvhxdammpkwkycrqtegepyxtohspeasrdtinjhbesilsvffnzznltsspjwuogdyzvanalohmzrywdwqqcukjceothydlgtocukc";
        System.out.println(longestPalindrome3(str));
    }

    public static String longestPalindrome2(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }

        int start = 0;
        int end = s.length();
        boolean flag = true;
        int tempStart = 0;
        int tempEnd = 0;
        int i = 0;

        while(start <= end) {
            String str = s.substring(start, end);
            String str2 = s.substring(start + 1, end);
            String str3 = s.substring(start, end - 1);
            if (str.equals(reverse(str))) {
                return str;
            } else if (str2.equals(reverse(str2))) {
                return str2;
            } else if (str3.equals(reverse(str3))) {
                return str3;
            }
            if (flag) {
                end--;
                tempEnd = end;
                i++;
                flag = false;
            } else {
                start++;
                end = tempEnd;
                flag = true;
                i++;
            }
            if (i == 2) {
                i = 0;
                end--;
            }
        }

        return "";
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }
        int length = s.length();
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < length - 1; i++) {
            String substring = "";
            for (int j = i + 1; j <= length; j++) {
                substring = s.substring(i, j);
                if (isPalindromic(substring)) {
                    if ((maxY - maxX) < substring.length()) {
                        maxY = j;
                        maxX = i;
                    }
                }
            }
        }

        return s.substring(maxX, maxY);
    }

    public static String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    public static boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static String longestPalindrome3(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }
        char[] array = s.toCharArray();
        int maxLength = 0;
        int maxLeft = 0;
        int maxRight = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (maxLength <= j - i - 1&& validSomething(array, i, j)) {
                    maxLength = j - i;
                    maxRight = j;
                    maxLeft = i;
                }
            }
        }

        return s.substring(maxLeft, maxRight + 1);
    }

    public static boolean validSomething(char[] array, int left, int right) {
        while (left <= right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
