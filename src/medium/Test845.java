package medium;

/**
 * 我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：
 *
 * B.length >= 3
 * 存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
 * （注意：B 可以是 A 的任意子数组，包括整个数组 A。）
 *
 * 给出一个整数数组 A，返回最长 “山脉” 的长度。
 *
 * 如果不含有 “山脉” 则返回 0。
 *
 */

/**
 * ##################没做出来，答案是看的###################
 */
public class Test845 {
    public static void main(String[] args) {
        //int[] arr = new int[]{2,1,4,7,3,2,5};
       // int[] arr = new int[]{2, 3};
        int[] arr = new int[]{3, 2};
        Test845 test845 = new Test845();
        System.out.println(test845.longestMountain(arr));
    }

    public int longestMountain(int[] A) {
        int ans = 0;
        int start = -1;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i]) {
                if (start != -1) {
                    ans = Math.max(ans, i - start + 1);
                }
            } else if (A[i - 1] < A[i]) {
                if (i == 1 || A[i - 2] >= A[i - 1]) {
                    start = i - 1;
                }
            } else {
                start = -1;
            }
        }
        return ans;
    }

    public int longestMountain2(int[] A) {
        int start = -1;
        int ans = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) { // 总是在上升阶段，确定山脉起点 start
                if (i == 1 || A[i - 2] >= A[i - 1]) {
                    start = i - 1;
                }
            } else if (A[i - 1] > A[i]) {
                if (start != -1) {
                    ans = Math.max(ans, i - start + 1); // 总是在下降阶段，计算山脉长度
                }
            } else {
                start = -1; // 平缓期重置起点
            }
        }

        return ans;
    }
}
