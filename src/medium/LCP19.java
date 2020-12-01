package medium;

/**
 *  没做出来，动态规划
 */
public class LCP19 {
    public int minimumOperations(String leaves) {
        if (leaves == null || leaves == "") {   // 排除 不合法参数情况
            return 0;
        }
        int length = leaves.length();
        char[] chars = leaves.toCharArray();

        /*
            状态数组，state[i][j]中：
                i表示终止下标
                j表示：0为左半边，1为中间部分，2为右半边
            state[i][j] 表示 从0到i需要调整的叶子数
         */
        int[][] state = new int[length][3];

        /*
            记录 已知状态数组元素：
                1、第一个叶子，必须是左半部分，所以只需判断是不是 黄色叶子 即可
                2、第一个叶子，必须是左半部分，所以 state[0][1] 和 state[0][2] 都是无效的
                3、第二个叶子，可以是左半部分，也可以是中间部分，但是不能是右半部分(每个区间必须有叶子)，
                    因此 state[1][2]是无效的
         */
        state[0][0] = chars[0] == 'y' ? 1 : 0;
        state[0][1] = state[0][2] = state[1][2] = Integer.MAX_VALUE;

        int isYellow = 0;   // 判断 当前遍历的叶子 是不是 黄色

        /*
            遍历 原叶集，生成状态数组
         */
        for (int i = 1; i < length; i++) {
            isYellow = chars[i] == 'y' ? 1 : 0;
            state[i][0] = state[i - 1][0] + isYellow;
            state[i][1] = Math.min(state[i - 1][0], state[i - 1][1]) + (1 - isYellow);
            if (i > 1) {    // 右半部分 的叶子 必须是第2个元素之后的元素
                state[i][2] = Math.min(state[i - 1][1], state[i - 1][2]) + isYellow;
            }
        }

        /*
            最终结果 为 state[length - 1][2]
            因为 state[i][j]最终结果的 i 必须为 length - 1，state[length - 1][j] 中的 j 必须为2
         */
        return state[length - 1][2];
    }
}
