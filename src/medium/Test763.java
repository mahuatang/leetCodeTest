package medium;

import java.util.*;

public class Test763 {
    public static void main(String[] args) {
        //partitionLabels("ababcbacadefegdehijhklij");
        partitionLabels("caedbdedda");
    }

    /**
     * 使用贪心算法，自己的算法过于复杂
     * @param S
     * @return
     *
     *
     */

    public List<Integer> partitionLabels2(String S) {
        ArrayList<Integer> result = new ArrayList<>();
        if (S == null || S.length() <= 0) {
            return result;
        }

        /*
            填充 lastIndex数组
         */
        int[] lastIndex = new int[26]; // 存储 一个字母 的 最后一次出现下标
        Arrays.fill(lastIndex, -1);
        int length = S.length();
        for (int i = 0; i < length; i++) {
            lastIndex[S.charAt(i) - 'a'] = i;
        }

        /*
            计算 结果数组
         */
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < length; i++) {
            endIndex = Math.max(endIndex, lastIndex[S.charAt(i) - 'a']);    // 取出当前最大的 最后一个下标
            if (i == endIndex) {    // 若 相等，则之前的所有元素，都仅在 i之前出现，可以记录结果
                result.add(endIndex - startIndex + 1);
                startIndex = endIndex + 1;
            }
        }

        return result;
    }

    public static List<Integer> partitionLabels(String S) {
        char[] chars = S.toCharArray();
        Map<String, List<Integer>> charMaps = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'i') {
                System.out.println();
            }
            List<Integer> list = charMaps.get(chars[i] + "");
            if (list == null) {
                list = new LinkedList<>();
            }
            list.add(i);
            charMaps.put(chars[i] + "", list);
        }
        List<List<Integer>> arrList = new LinkedList<>() ;
        for(List<Integer> list : charMaps.values()) {
            arrList.add(list);
        }
        String str = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrList.size();) {
            List<List<Integer>> lists = new LinkedList<>();
            List<Integer> listA = arrList.get(0);
            lists.add(listA);
            int max = listA.get(listA.size() - 1);
            arrList.remove(0);
            for (int j = 0; j < arrList.size();) {
                List<Integer> otherList = arrList.get(j);
                int min = otherList.get(0);
                if (getListMax(lists) > min) {
                    lists.add(arrList.get(j));
                    arrList.remove(j);
                } else {
                    j++;
                }
            }
            int length = 0;
            for (List<Integer> temp : lists) {
                length += temp.size();
            }
            list.add(length);
        }
        return list;
    }

    public static int getListMax(List<List<Integer>> lists) {
        int max = -1;
        for (List<Integer> list : lists) {
            int listMax = list.get(list.size() - 1);
            if (max < listMax) {
                max = listMax;
            }
        }
        return max;
    }
}
