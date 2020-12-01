package easy;

/**
 * 抄的：
 * 题解：
 * 思路概述：
 * 给点给一个target，不管值是正值还是负值，需要的步数是同样的，所以我们统一考虑为正值，统一取绝对值。
 * 向右走是加，向左走是减，那我们可以先不停的向右走，那么走的格数就是1+2+3+… 当无法得到给定的target值时，代表我们其中是有几步是需要向左走的，那么向左走一步，会导致结果减小2对应的步数。比如第二格我们向左，本来是加2，现在是减2，一来一去少了2*2=4格。
 * 所以我们可以不断累加，直到遇到sum值-target是偶数的情况，当前走的步数就是结果
 */
public class Test754 {
    public static void main(String[] args) {
        System.out.println(-2%2);
        System.out.println(reachNumber(2));
    }

    public static int reachNumber(int target) {
        target = Math.abs(target);

        int sum = 0;
        int k = 1;

        while(sum < target || (sum - target) % 2 != 0) {
            sum += k;
            k++;
        }

        return --k;
    }
}
