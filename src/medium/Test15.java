package medium;

import java.util.*;

public class Test15 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,-1,-1,0};
        List<List<Integer>> list = threeSum(arr);
        System.out.println("hh");
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> list = new LinkedList<>();
        if (nums == null || len < 3) {
            return list;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int e = len - 1;


            while (l < e) {
                int sum = nums[i] + nums[l] + nums[e];
                if (sum > 0) {
                    e--;
                } else if (sum < 0) {
                    l++;
                } else {
                    list.add(Arrays.asList(nums[i],nums[l],nums[e]));
                    while(l < e && nums[l] == nums[l + 1]) l++;
                    while(l < e && nums[e] == nums[e - 1]) e--;
                    l++;
                    e--;
                }
            }
        }

        return list;
    }

    /*public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        Map<String, Object> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> integerList = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(integerList);
                        String str = "";
                        for (Integer integer : integerList) {
                            str += integer;
                        }
                        if (map.get(str) == null) {
                            map.put(str, "");
                            list.add(integerList);
                        }
                    }
                }
            }
        }

        return list;
    }*/
}
