package easy;

public class Test189 {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }


    /**
     * 抄的方法，先把最后一个取出来，前面元素全部下移，首元素赋值最后一个
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }

        System.out.println();

        /*for (int i = 1; i <= k; i++) {
            int j = 1;
            int[] nums2 = new int[nums.length];
            while (j < nums.length) {
                nums2[j] = nums[j - 1];
                j++;
            }
            nums2[0] = nums[nums.length - 1];

            nums = nums2;
        }
        System.out.println();*/

        /*StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for (int m : nums) {
            buffer.append(m + ",");
        }

        String str = buffer.deleteCharAt(buffer.lastIndexOf(",")).append("]").toString();
        System.out.println(str);*/
    }
}
