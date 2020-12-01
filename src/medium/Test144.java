package medium;

import java.util.LinkedList;
import java.util.List;

public class Test144 {
    public static void main(String[] args) {
        Test144 test144 = new Test144();
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> list = test144.preorderTraversal(root);

        System.out.println();

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root != null) {
            root.preOrder(list);
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public void preOrder(List<Integer> list) {
        if (this != null) {
            list.add(this.val);
        }

        if (this.left != null) {
            this.left.preOrder(list);
        }

        if (this.right != null) {
            this.right.preOrder(list);
        }
    }

    public void infixOrder(List<Integer> list) {
        if (this.left != null) {
            this.left.infixOrder(list);
        }

        list.add(this.val);

        if (this.right != null) {
            this.right.infixOrder(list);
        }
    }
}
