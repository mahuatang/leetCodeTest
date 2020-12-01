package easy;

import java.util.*;

public class Test970 {
    public static void main(String[] args) {
        List<Integer> list = powerfulIntegers(2, 1, 10);
        for (int i : list) {
            System.out.println(i);
        }
    }

    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new TreeSet<>();
        if (x == 1 && y != 1) {
            for (int j = 0; Math.pow(y, j) <= bound-1; j++) {
                set.add((int)Math.pow(y, j) + 1);
            }
        } else if (x != 1 && y == 1) {
            for (int j = 0; Math.pow(x, j) <= bound - 1; j++) {
                set.add((int)Math.pow(x, j) + 1);
            }
        } else if(x == 1 && y == 1) {
            if (2 <= bound) {
                set.add(2);
            }
        } else {
            for (int i = 0; Math.pow(x, i) <= bound - 1; i++) {
                for (int j = 0; Math.pow(y, j) <= bound - 1; j++) {
                    int result = (int)(Math.pow(x, i) + Math.pow(y, j));
                    if (result <= bound) {
                        set.add(result);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    /**好的解法
     *
     * class Solution {
     *     public List<Integer> powerfulIntegers(int x, int y, int bound) {
     *         Set<Integer> set = new HashSet<>();
     *
     *         for (int a = 1; a < bound; a *= x) {
     *             for (int b = 1; a + b <= bound; b *= y) {
     *                 set.add(a + b);
     *                 if (y == 1) break;
     *             }
     *             if (x == 1) break;
     *         }
     *
     *         return new ArrayList<>(set);
     *     }
     * }
     */
}
