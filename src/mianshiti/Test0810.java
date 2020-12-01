package mianshiti;

public class Test0810 {
    public static void main(String[] args) {

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (sr < 0 || sr > image.length ||sc < 0 || sc > image.length || image[sr][sc] == oldColor || image[sr][sc] == newColor) {
            return;
        }
        image[sr][sc] = newColor;
        dfs(image, sr - 1, sc, oldColor, newColor);
        dfs(image, sr + 1, sc, oldColor, newColor);
        dfs(image, sr, sc - 1, oldColor, newColor);
        dfs(image, sr, sc + 1, oldColor, newColor);
    }

}
