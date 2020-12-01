package easy;

public class Test492 {
    public static void main(String[] args) {
        //System.out.println(Math.pow(3,3));
        System.out.println(constructRectangle(2));

    }

    public static int[] constructRectangle(int area) {
        int[] array = new int[2];
        Integer min = null;
        for (int i = 1; i * i <= area; i++) {
            for (int j = i; i * j <= area; j++) {
                if (i * j == area) {
                    if (min != null) {
                        if (j - i < min) {
                            min = j - i;
                            array[0] = j;
                            array[1] = i;
                        }
                    } else {
                        min = j - i;
                        array[0] = j;
                        array[1] = i;
                    }
                }
            }
        }
        return array;
    }

    /**
     * 好的解法
     *
     *
     * int sqrt = (int) Math.sqrt(area);
     *         while (area % sqrt != 0) {
     *             sqrt--;
     *         }
     * return new int[]{area / sqrt, sqrt};
     */
}
