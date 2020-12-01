package easy;

public class Test605 {

    public static void main(String[] args) {
        canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2);
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = 0;
        for(int i = 0; i < flowerbed.length;) {
            if (flowerbed[i] == 1) {
                i++;
            } else {
                if (i >= 1) {
                    if (flowerbed[i - 1] == 1) {
                        i++;
                    } else {
                        if (i < flowerbed.length - 1) {
                            if (flowerbed[i + 1] == 1) {
                                i += 2;
                            } else {
                                flowerbed[i] = 1;
                                size ++;
                                i++;
                            }
                        } else {
                            i++;
                            size++;
                        }
                    }
                } else {
                    if (i < flowerbed.length - 1) {
                        if (flowerbed[i + 1] == 1) {
                            i += 2;
                        } else {
                            flowerbed[i] = 1;
                            size ++;
                            i++;
                        }
                    } else {
                        i++;
                        size++;
                    }
                }

            }
        }

        if (size >= n) {
            return true;
        }

        return false;
    }
}
