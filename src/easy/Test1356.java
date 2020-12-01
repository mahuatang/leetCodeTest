package easy;

/**
 * 还能再改进，把空间省掉，直接用原来的就行啦！
 * 另外，乘以100000就可以了，算法设计十进制的高位存储bit为1的数量，十进制的低位存原始值，int有16bit，高位最大为16，两个长度，值最大为10^4,4个长度，所以扩充系数取100000就够用了；
 *
 *   public int[] sortByBits(int[] arr) {
 *         for (int i = 0; i < arr.length; i++) {
 *             arr[i] += Integer.bitCount(arr[i]) * 100000;
 *         }
 *         Arrays.sort(arr);
 *         for (int i = 0; i < arr.length; i++) {
 *             arr[i] %= 100000;
 *         }
 *         return arr;
 *     }
 */
public class Test1356 {
    public static void main(String[] args) {
        Test1356 test1356 = new Test1356();
        int aa = test1356.convertToBinaryData(10);
        System.out.println();
    }

    public int[] sortByBits(int[] arr) {

        return null;
    }

    public int convertToBinaryData(int a) {
        double t = 0;
        int r = 0;
        int j = 0;

        while(a != 0) {
            r = a % 2;
            a = a / 2;
            t += r * Math.pow(10, j);
            j++;
        }
        return (int)t;
    }
}
