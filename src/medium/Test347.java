package medium;

import java.util.*;

public class Test347 {
    public static void main(String[] args) {
       // int[] sums = new int[]{1, 1, 2, 2, 2, 3};
        int[] sums = new int[]{2,3,36,3,2,2,8,6,8,10,8};
        topKFrequent(sums, 3);
        System.out.println();
        /*int[] num1 = new int[]{-38,-74,14,-98,6,50,-61,109,8,11,67,-81,115,3,-15,-18,-30,42,52,-54,-64,63,-72,71,72,-77,78,-90,89,4,-12,-21,20,-33,33,39,40,48,53,74,-78,81,82,-88,-93,93,-97,-101,103,-114,117,-120,121,122,-124,-2,-7,-9,13,-20,-26,27,28,34,46,54,-58,61,62,66,-91,114,-117,118,119,-125,2,9,-14,-17,22,24,31,32,-34,-37,-39,-46,47,60,-62,-67,-76,76,77,80,-87,91,99,-102,102,-109,-111,-112,113,120,-123,1,-8,-11,15,16,-19,18,21,-24,-27,26,-29,-31,-32,36,38,44,45,-52,-59,-63,-66,65,68,70,73,-82,87,92,98,100,-104,104,-106,116,-119};
        int[] num2 = new int[]{647,-74,-38,-98,14,145,327,512,779,903,930,-909,-870,-809,-667,-666,-489,-363,-312,-182,-165,-159,-61,6,50,109,168,368,406,615,844,850,955,-987,-933,-854,-853,-844,-830,-802,-780,-678,-677,-676,-630,-596,-562,-549,-540,-466,-419,-412,-392,-277,-267,-236,-216,-166,-81,8,11,67,115,161,275,288,294,336,440,490,528,554,569,790,836,875,939,949,-952,-947,-930,-811,-765,-746,-727,-660,-619,-566,-528,-520,-447,-434,-398,-366,-318,-299,-295,-257,-255,-247,-241,-221,-202,-197,-177,-90,-77,-72,-64,-54,-30,-18,-15,3,42,52,63,71,72,78,89,261,263,333,360,437,441,547,611,616,625,699,700,729,734,756,769,775,788,813,906,916,946};
        Arrays.sort(num1);
        Arrays.sort(num2);
        for (int i : num1) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i : num2) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println(num1.length);
        System.out.println(num2.length);*/
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                map.put(nums[i], sum);
                break;
            }
            if (nums[i] != nums[i + 1]) {
                map.put(nums[i], sum);
                sum = 1;
                continue;
            }
            sum++;
        }
        List<Map.Entry<Integer, Integer>> list222 = new ArrayList<>(map.entrySet());
        Collections.sort(list222, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        int[] nums2 = new int[k];
        for (int i = 0; i < k; i++) {
            nums2[i] = list222.get(i).getKey();
        }
        return nums2;
    }
}
