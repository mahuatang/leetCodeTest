package easy;

public class Test633 {
    public static void main(String[] args) {
        method(7);
    }

    public static Boolean method(int c) {
        double c2 = Double.valueOf(c);
        int tmp =  (int)(Math.sqrt(c2));

        for (int i = 0; i <= tmp;) {
            int exp = i * i + tmp * tmp;

            if (exp < c) {
                i++;
            } else if (exp > c) {
                tmp--;
            } else {
                return true;
            }
        }
        return false;
    }
}
