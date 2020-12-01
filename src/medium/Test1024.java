package medium;

public class Test1024 {
    public static void main(String[] args) {
        int[][] clips = {{0, 5}, {6, 8}};
        videoStitching(clips, 7);
    }

    public static int videoStitching(int[][] clips, int T) {
        int start = 0;
        int size = 0;
        int sum = 0;
        int m = 0;
        while(m++ < clips.length && start < T) {
            for (int i = 0; i < clips.length; i++) {
                if (clips[i][0] <= start) {
                    if (clips[i][1] - start > size) {
                        size = clips[i][1] - start;
                    }
                }
            }
            if (size != 0) {
                start += size;
                sum++;
            }
            size = 0;
        }
        if (start >= T) {
            return sum;
        } else {
            return -1;
        }
    }
}
