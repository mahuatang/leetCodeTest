package easy;

public class Test771 {
    public static void main(String[] args) {

    }

    public int numJewelsInStones(String J, String S) {
        char[] chars = J.toCharArray();
        char[] chars2 = S.toCharArray();
        int count = 0;
        for (char s : chars2) {
            for (char s2 : chars) {
                if (s == s2) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
