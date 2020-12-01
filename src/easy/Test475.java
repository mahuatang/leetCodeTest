package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 采用暴力破解办法
 */
public class Test475 {
    public static void main(String[] args) {
        Test475 test475 = new Test475();
        /*int sum1 = test475.findRadius(new int[]{1, 5}, new int[]{2});
        int sum2 = test475.findRadius(new int[]{1, 2, 3, 4}, new int[]{1, 4});
        int sum3 = test475.findRadius(new int[]{1, 2, 3}, new int[]{2});
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);*/

       /* int sum1 = test475.findRadius(new int[]{1,2,3,5,15}, new int[]{2, 30});
        System.out.println(sum1);*/

        /*int sum1 = test475.findRadius(new int[]{1}, new int[]{1, 2, 3, 4});
        System.out.println(sum1);*/

        int[] cc1 = new int[]{474833169,264817709,998097157,817129560};
        int[] cc2 = new int[]{197493099,404280278,893351816,505795335};

        System.out.println(test475.findRadius(cc1, cc2));
    }

    public int findRadius(int[] houses, int[] heaters) {
        List<Integer> list = new LinkedList<>();
        for (int i : houses) {
            list.add(getDistance(i, heaters));
        }
        int maxDistance = list.get(0);

        for (int k : list) {
            if (k > maxDistance) {
                maxDistance = k;
            }
        }
        return maxDistance;
    }

    int getDistance(int point, int[] heaters) {
        int mixDistance = Math.abs(heaters[0] - point);

        for (int value : heaters) {
            if (Math.abs(value - point) < mixDistance) {
                mixDistance = Math.abs(value - point);
            }
        }
        return mixDistance;
    }


}
