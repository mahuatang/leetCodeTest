package easy;

public class Test925 {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("vtkgn", "vttkgnn"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        for (; i < name.length() && j < typed.length();) {
            if (!name.substring(i, i + 1).equals(typed.substring(j, j + 1))) {
                if (j > 0 && typed.substring(j, j + 1).equals(typed.substring(j - 1, j))) {
                    j++;
                    continue;
                } else {
                    return false;
                }
            }
            i++;
            j++;
        }
        if (i < name.length()) {
            return false;
        }
        if (j < typed.length()) {
            for (int m = j; m < typed.length(); m++) {
                if (!typed.substring(m, m + 1).equals(typed.substring(j - 1, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
