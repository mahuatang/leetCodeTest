package easy;

public class Test111 {
    public int min = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);

        if (root.left == null || root.right == null) {
            return m1 + m2 + 1;
        }

        return Math.min(1 + m1, 1 + m2);
    }

    public static void main(String[] args) {
        //[3,9,20,null,null,15,7]
       /* TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);*/

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);

        Test111 test111 = new Test111();
        System.out.println(test111.minDepth(treeNode));

    }

}
