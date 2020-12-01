package easy;

/**
 * 使用向量的方式更加简单
 */
public class Test1037 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {0, 1}, {2, 1}};

        System.out.println(isBoomerang(arr));

    }

    public static boolean isBoomerang(int[][] points) {
        if(isSame(points)) {
            return false;
        }
        if (points[1][0] - points[0][0] == 0) {
            for (int i = 2; i < points.length; i++) {
                if (points[0][0] == points[i][0]) {
                    return false;
                }
            }
        } else {
            double rate = (points[1][1] - points[0][1]) / ((points[1][0] - points[0][0]) * 1.0);
            int flag = 0;
            for (int i = 0; i < points.length; i++) {
                for (int j = i + 2; j < points.length; j++) {
                    if (points[j][0] != points[i][0]) {
                        double rate2 = (points[j][1] - points[i][1]) / ((points[j][0] - points[i][0])*1.0);
                        if (rate == rate2) {

                            return false;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isSame(int[][] points) {
        if(points[0][0] == points[1][0] && points[0][1] == points[1][1] ||
                points[0][0] == points[2][0] && points[0][1] == points[2][1] ||
                points[2][0] == points[1][0] && points[2][1] == points[1][1]) {
            return true;
        }
        return false;
    }
}
