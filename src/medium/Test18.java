package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 如何跳过重复元素是解决本问题的关键。
 * 1.if(i > 0 && nums[i] == nums[i-1]) continue;
 * 2.if(j > i + 1 && nums[j] == nums[j-1]) continue;
 */
public class Test18 {
    public static void main(String[] args) {
      //  int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int[] nums = new int[]{0, 0, 0, 0};
     //   int[] nums = new int[]{-3, -2, -1, 0, 0, 1, 2, 3};
        int target = 0;
        Test18 test18 = new Test18();
        List<List<Integer>> result = test18.fourSum(nums, target);
        System.out.println();
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                int l = j + 1;
                int e = nums.length - 1;
                int result;
                while (l < e) {
                    result = nums[i] + nums[j] + nums[l] + nums[e] - target;
                    if (result == 0) {
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[l]);
                        res.add(nums[e]);

                        list.add(res);

                        while (l < e && nums[l] == nums[l + 1]) l++;
                        while (e > l && nums[e] == nums[e - 1]) e--;
                        l++;
                        e--;
                    } else if (result < 0) {
                        l++;
                    } else {
                        e--;
                    }
                }
            }
        }
        return list;
    }
}
