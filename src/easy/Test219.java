package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    Integer count = map.get(nums[i]);
                    if (count == null) {
                        map.put(nums[i], j - i);
                    } else {
                        if (j - i < count) {
                            map.put(nums[i], j - i);
                        }
                    }
                    break;
                }
            }
        }

        Set<Integer> set = map.keySet();
        for (int i : set) {
            if (map.get(i) <=  k) {
                return true;
            }
        }
        return false;
    }

    /**
     * 好的解法，使用散列表
     * public boolean containsNearbyDuplicate(int[] nums, int k) {
     *         Set<Integer> set = new HashSet<>();
     *         for (int i = 0; i < nums.length; ++i) {
     *             if (set.contains(nums[i])) return true;
     *             set.add(nums[i]);
     *             if (set.size() > k) {
     *                 set.remove(nums[i - k]);
     *             }
     *         }
     *         return false;
     *     }
     */
}
