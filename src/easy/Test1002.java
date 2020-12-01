package easy;

import java.util.*;

public class Test1002 {
    public static void main(String[] args) {
        String[] strings = new String[]{"haho", "awohf", "bhoohk", "chohol"};
        commonChars(strings);
    }

    /**
     * 看过答案的，合理利用数组，下标是位置，值是次数。
     * @param A
     * @return
     */
    public static List<String> commonChars(String[] A) {
        int[] charCount = new int[26];
        String firstStr = A[0];
        for (int i = 0; i < firstStr.length(); i++) {
            charCount[firstStr.charAt(i) - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            String string = A[i];
            int[] curCount = new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                curCount[A[i].charAt(j) - 'a']++;
            }
            for (int k = 0; k < 26; k++) {
                charCount[k] = Math.min(charCount[k], curCount[k]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) {
                for (int j = 0; j < charCount[i]; j++) {
                    list.add((char)(i + 'a') + "");
                }
            }
        }
        return list;
    }
}
