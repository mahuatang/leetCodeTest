package medium;

import java.util.Arrays;
import java.util.List;

public class TestLCP3 {
    public static void main(String[] args) {
        //System.out.println(robot("URR", new int[][]{}, 3, 2));
       // System.out.println(robot("URR", new int[][]{{2, 2}}, 3, 2));
        System.out.println(robot("URR", new int[][]{{4, 2}}, 3, 2));
      //  System.out.println(robot("URRURRR", new int[][]{{7, 7},{0, 5},{2, 7},{8, 6},{8, 7},{6, 5}, {4, 4}, {0, 3}, {3, 6}}, 4915, 1966));
    }

    public static boolean robot(String command, int[][] obstacles, int x, int y) {
        List<String> commands = Arrays.asList(command.split(""));
        boolean isArrived = isArrived(commands, x, y);

        if (!isArrived) {
            return false;
        } else {
            for (int[] obstacle : obstacles) {
                int obX = obstacle[0];
                int obY = obstacle[1];
                boolean isObs = isArrived(commands, obX, obY);
                if (isObs && obX <= x && obY <= y) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isArrived(List<String> commands, int x, int y) {
        int moveX = 0;
        int moveY = 0;
        for (String c : commands) {
            if (c.equals("U")) {
                moveY += 1;
            } else {
                moveX += 1;
            }
        }

        int data = Math.min(x / moveX, y / moveY);
        int newX = x - data * moveX;
        int newY = y - data * moveY;

        int i = 0;
        int j = 0;
        if (i == newX && j == newY) {
            return true;
        }
        for (String c : commands) {
            if (c.equals("U")) {
                j += 1;
            } else {
                i += 1;
            }
            if (i == newX && j == newY) {
                return true;
            }
        }
        return false;
    }

    //暴力破解法，超时
    /*public static boolean robot(String command, int[][] obstacles, int x, int y) {
        List<String> commands = Arrays.asList(command.split(""));
        int startX = 0;
        int startY = 0;

        while (startX <= x && startY <= y) {
            for (String c : commands) {
                if (c.equals("U")) {
                    startY += 1;
                } else {
                    startX += 1;
                }
                if (!checkIsFalse(obstacles, startX, startY)) {
                    return false;
                }
                if (startX == x && startY == y) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkIsFalse(int[][] obstacles, int x, int y) {
        if (obstacles.length == 0) {
            return true;
        }
        for (int[] obstacle : obstacles) {
            if (x == obstacle[0] && y == obstacle[1]) {
                return false;
            }
        }
        return true;
    }*/
}
