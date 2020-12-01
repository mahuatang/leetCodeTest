package medium;

public class Test223 {
    public static void main(String[] args) {
        int result = computeArea( -3, 0, 3, 4, 0, -1, 9, 2);
        System.out.println(result);
    }

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (C <= E || A >= G || B >= H || D <= F) {
            return computeArea(A, B, C, D) + computeArea(E, F, G, H);
        }

        int resultA = 0;
        int resultB = 0;
        if (D < H) {
            if (B > F) {
                resultA = D - B;
            } else {
                resultA = D - F;
            }
        } else {
            if (B > F) {
                resultA = H - B;
            } else {
                resultA = H - F;
            }
        }

        if (A > E) {
            if (C < G) {
                resultB = C - A;
            } else {
                resultB = G - A;
            }
        } else {
            if (C < G) {
                resultB = C - E;
            } else {
                resultB = G - E;
            }
        }


        return computeArea(A, B, C, D) + computeArea(E, F, G, H) - Math.abs(resultA) * Math.abs(resultB);
    }

    public static int computeArea(int a, int b, int c, int d) {
        return Math.abs(d - b) * Math.abs(c - a);
    }
}
