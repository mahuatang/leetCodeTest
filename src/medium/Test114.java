package medium;

public class Test114 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);

        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.right = new TreeNode(6);


        Test114 test114 = new Test114();
        test114.flatten(treeNode);
        System.out.println(":h");
    }

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode tempNode = root;
        while(tempNode.right != null) {
            tempNode = tempNode.right;
        }
        tempNode.right = temp;
    }
}
