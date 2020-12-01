package medium;

import java.util.*;

public class Test455 {
    public static void main(String[] args) {
        //System.out.println(findContentChildren(new int[]{1, 5, 4, 2, 3}, new int[]{1, 2, 8, 3, 6}));
        long l1 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - l1);
        //    System.out.println(findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        /*List<Integer> gList = new LinkedList<Integer>();
        Collections.addAll(gList, Arrays.stream(g).boxed().toArray(Integer[]::new));
        Collections.sort(gList);
        List<Integer> sList = new LinkedList<Integer>();
        Collections.addAll(sList, Arrays.stream(s).boxed().toArray(Integer[]::new));
        Collections.sort(sList);*/
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;

        for (int i : g) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= i) {
                    s[j] = 0;
                    result++;
                    break;
                }
            }
        }

        return result;
    }

    /*public static int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0, si = 0;
        while (gi < grid.length && si < size.length) {
            if (grid[gi] <= size[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }*/
}
