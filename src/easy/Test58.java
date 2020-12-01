package easy;

public class Test58 {
    public static int lengthOfLastWord(String s) {
        int lastIndex = s.lastIndexOf(" ");
        if (lastIndex == s.length() - 1) {
            s = s.trim();
        }

        String str = s.trim();
        String str2 = str.replaceAll("", " ");

        if (str.equals(str2)) {
            return str.length();
        }
        int lastIndex2 = str.lastIndexOf(" ");

        return str.length() - lastIndex2 - 1;
    }

    public static void main(String[] args) {
        String str = "b a ";
        System.out.println(lengthOfLastWord(str));
    }
}
