package easy;

import java.util.*;

public class Test575 {
    public static void main(String[] args) {
        int[] candies = new int[]{1,1,2,2,3,3};
        distributeCandies(candies);
    }

    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i : candies) {
            set.add(i);
        }

        int count = set.size();
        if (count > candies.length / 2) {
            return candies.length / 2;
        } else {
            return (int)count;
        }
    }
}
