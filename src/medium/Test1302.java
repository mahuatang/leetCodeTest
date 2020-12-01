package medium;

public class Test1302 {
    public int sum = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        root.left.left.left.left = new TreeNode(6);

        Test1302 test1302 = new Test1302();
        test1302.deepestLeavesSum(root);
    }

    public int deepestLeavesSum(TreeNode root) {
        int maxHeight = getMaxHeight(root);
        getResult(root, 1, maxHeight);
        return sum;
    }

    public int getMaxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getMaxHeight(root.left);
        int rightHeight = getMaxHeight(root.right);

        return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
    }

    public void getResult(TreeNode root, int cur, int maxHeight) {
        if(root == null) {
            return;
        }
        if (cur == maxHeight) {
            sum += root.val;
        }

        if (cur < maxHeight) {
            getResult(root.left, cur + 1, maxHeight);
            getResult(root.right, cur + 1, maxHeight);
        }
    }

}


