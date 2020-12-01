package easy;

public class Test344 {
    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b', 'c'};
        reverseString(arr);
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                char temp = s[j];
                s[j] = s[j + 1];
                s[j + 1] = temp;
            }
        }
        System.out.println();
    }
}
