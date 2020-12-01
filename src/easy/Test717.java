package easy;

public class Test717 {
    public static void main(String[] args) {

    }

    public static boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == 1) {
                if (i == bits.length - 2) {
                    return false;
                } else {
                    i++;
                }
            }
        }
        return true;
    }
}
