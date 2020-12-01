package medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Test94 {
    public static void main(String[] args) {
        Test94 test94 = new Test94();
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> list = test94.inorderTraversal(root);

        System.out.println();
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root != null) {
            root.infixOrder(list);
        }
        return list;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root.left);
        }
        return list;
    }
}
