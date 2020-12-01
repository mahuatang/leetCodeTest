package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 优秀解法
 *
 *  public int countNodes(TreeNode root) {
 *     	if(root == null) {
 *     		return 0;
 *                }
 *     	int left = countNodes(root.left);
 *     	int right = countNodes(root.right);
 *
 *     	return left+right+1;
 *
 *     }
 */

public class Test222 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.contains(new String("aa"));
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        Test222 test222 = new Test222();
        test222.countNodes(root);
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        AtomicInteger integer = new AtomicInteger(0);
        countNode(root, integer);
        System.out.println(integer);
        return integer.intValue();
    }

    public void countNode(TreeNode root, AtomicInteger count) {
        if (root.left != null) {
            countNode(root.left, count);
        }
        count.incrementAndGet();
        if (root.right != null) {
            countNode(root.right, count);
        }
    }
}
