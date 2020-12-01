package easy;

public class Test844 {
    public static void main(String[] args) {
        backspaceCompare("ab#c", "ab#c");
    }

    public static boolean backspaceCompare(String S, String T) {
        return getMinStr(S).equals(getMinStr(T));
    }

    public static String getMinStr(String S) {
        for (int i = 0; i < S.length(); i++) {
            String str = S.substring(i, i + 1);
            if (str.equals("#")) {
                if (i == 0) {
                    S = S.substring(1);
                    i = -1;
                } else {
                    S = S.substring(0, i - 1) + S.substring(i + 1);
                    i -= 2;
                }
            }
        }
        return S;
    }
}
