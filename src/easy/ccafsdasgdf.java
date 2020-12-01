package easy;

import java.io.*;

public class ccafsdasgdf {
    public static void main(String[] args) {

    }
}

class Person {
    private Integer A;
    private Long B;
    private int c;
    private long d;

    public Integer getA() {
        return A;
    }

    public void setA(Integer a) {
        A = a;
    }

    public Long getB() {
        return B;
    }

    public void setB(Long b) {
        B = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public static int[][] convertStrToArray(String str) {
        str = str.replace("[", "").replace("]", "");
        String[] array = str.split(",");
        int[][] result = new int[array.length / 2][2];

        for (int i = 0; i < array.length; i+=2) {
            result[i / 2][0] = Integer.valueOf(array[i]);
            result[i / 2][1] = Integer.valueOf(array[i + 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        convertStrToArray("[[2,1],[5,4],[3,7],[6,2],[4,4],[1,8],[9,6],[5,3],[7,4],[1,9],[1,1],[6,6],[9,6],[1,3],[9,7],[4,7],[5,1],[6,5],[1,6],[6,1],[1,8],[7,2],[2,4],[1,6],[3,1],[3,9],[3,7],[9,1],[1,9],[8,9]]");
    }
}
