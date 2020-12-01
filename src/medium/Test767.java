package medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test767 {
    public static void main(String[] args) {
        Test767 test767 = new Test767();
        String S = new String("abcdfesaaanccb");
        test767.reorganizeString(S);
    }

    public String reorganizeString(String S) {
        char[] arrays = S.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arrays.length; i++) {
            Integer count = map.get(arrays[i]);
            if (count == null) {
                map.put(arrays[i], 1);
            } else {
                map.put(arrays[i], count + 1);
            }
        }
        int max = -1;
        char maxChar = ' ';
        for (char ha : map.keySet()) {
            Integer cc = map.get(ha);
            if (max < cc) {
                max = cc;
                maxChar = ha;
            }
        }
        if ((S.length() % 2 == 0 && max > S.length() / 2) || (S.length() % 2 != 0 && max > S.length() / 2 + 1)) {
            return "";
        }
        List<Character> characterList = new LinkedList<>();
        for (char ha : map.keySet()) {
            if (ha != maxChar) {
                Integer cc = map.get(ha);
                for (int i = 0; i < cc; i++) {
                    characterList.add(ha);
                }
            }
        }

        char[] result = new char[arrays.length];

        int i = 0;
        for (int j = 0; i < result.length && j < max; i += 2, j++) {
            result[i] = maxChar;
        }

        for (int m = i, j = 0; j < characterList.size(); m += 2, j++) {
            if (m >= result.length) {
                m = 1;
            }
            result[m] = characterList.get(j);
        }


        return new String(result);

    }
}
