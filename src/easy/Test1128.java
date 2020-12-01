package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1128 {
    public static void main(String[] args) {
      //  int[][] dominoes = new int[][]{{1,2},{2,1},{3,4},{5,6}};
       // System.out.println(numEquivDominoPairs(dominoes));
        int[][] aa = Person.convertStrToArray("[[2,1],[5,4],[3,7],[6,2],[4,4],[1,8],[9,6],[5,3],[7,4],[1,9],[1,1],[6,6],[9,6],[1,3],[9,7],[4,7],[5,1],[6,5],[1,6],[6,1],[1,8],[7,2],[2,4],[1,6],[3,1],[3,9],[3,7],[9,1],[1,9],[8,9]]");
        System.out.println(numEquivDominoPairs(aa));
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        for (int[] dominoe : dominoes) {
            int a = dominoe[0];
            int b = dominoe[1];
            String key = null;
            if(a > b) {
                key = "" + b + a;
            } else {
                key = "" + a + b;
            }
            Integer k = map.get(key);
            if (k == null) {
                map.put(key, 1);
            } else {
                map.put(key, ++k);
            }
        }

        Set<String> set = map.keySet();
        int result = 0;
        for (String str : set) {
            Integer value = map.get(str);
            if (value != 1) {
                result += value * (value - 1) / 2 ;
            }
        }

        return result;
    }
}
