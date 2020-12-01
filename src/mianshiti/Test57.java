package mianshiti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test57 {
    public static void main(String[] args) {
        findContinuousSequence(9);
    }

    public static int[][] findContinuousSequence(int target) {
        int priviot = target / 2 + 1;
        List<Integer> list = new LinkedList<>();

        int sum = 0;
        List<List<Integer>> result = new LinkedList<>();
        int k = 0;

        for (int i = priviot; i > 0; i--) {
            int oo = i;
            sum = 0;
            while(oo > 0) {
                sum += oo;
                list.add(oo);
                if(sum == target) {
                    //Collections.sort(list);
                    result.add(list);
                    break;
                }
                if (sum > target) {
                    break;
                }
                oo--;
            }
            list = new LinkedList<>();
        }

        int[][] re = new int[result.size()][];
        int kk = 0;
        for (int m = result.size() - 1; m >= 0; m--) {
            List<Integer> li = result.get(m);
            int[] haha = new int[li.size()];
            for (int i = li.size() - 1; i >= 0; i--) {
                haha[li.size() - i - 1] = li.get(i);
            }
            re[kk] = haha;
            kk++;
        }

        return re;
    }
}
