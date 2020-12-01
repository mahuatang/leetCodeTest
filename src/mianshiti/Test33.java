package mianshiti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test33 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 8, 6, 12, 16, 14, 10};
        verifyPostorder(array);
    }

    public static boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length == 0) {
            return true;
        }

        boolean jj = haha(postorder, 0, postorder.length - 1);
        return jj;
    }

    public static boolean haha(int[] postorder, int start, int end) {
        if (start == end) {
            return true;
        }

        int root = postorder[end];
        int i = start;
        for (; i < end; i++) {
            if (root < postorder[i]) break;
        }

        int m = i;

        for (; i < end; i++) {
            if (root > postorder[i]) return false;
        }

        if (m == start || m == end) {
            return haha(postorder, start, end - 1);
        } else {
            return haha(postorder, start, m - 1) && haha(postorder, m, end -1);
        }
    }
}
