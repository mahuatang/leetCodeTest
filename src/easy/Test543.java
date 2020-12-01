package easy;

/**
 * 二叉树的直径不一定过根节点，因此需要去搜一遍所有子树(例如以root，root.left, root.right...为根节点的树)对应的直径，取最大值。
 * root的直径 = root左子树高度 + root右子树高度
 * root的高度 = max {root左子树高度, root右子树高度} + 1
 */


public class Test543 {
    public int max = 0;
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        Test543 test543 = new Test543();
        int cc = test543.diameterOfBinaryTree(node);
        System.out.println();
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return 0;
        }
        getDept(root);
        System.out.println();
        return max;
    }

    public int getDept(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDept(root.left);
        int right = getDept(root.right);
        max = max > (left + right)  ? max : left + right;
        return Math.max(left, right) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
