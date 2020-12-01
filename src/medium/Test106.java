package medium;

public class Test106 {
    public static void main(String[] args) {
        int[] postOrder = new int[]{9,15,7,20,3};
        int[] inorder = new int[]{9,3,15,20,7};

        Test106 test106 = new Test106();
        TreeNode treeNode = test106.buildTree(inorder, postOrder);

        System.out.println();
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    public TreeNode buildTree(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd) {
        if (pStart >= pEnd || iStart >= iEnd) {
            return null;
        }
        int root = postorder[pEnd - 1];

        TreeNode rootNode = new TreeNode(root);

        int root_value_index = 0;

        for (int i = iStart; i < iEnd; i++) {
            if (root == inorder[i]) {
                root_value_index = i;
                break;
            }
        }

        int lenth = root_value_index - iStart;

        rootNode.left = buildTree(inorder, iStart, root_value_index, postorder, pStart, pStart + lenth);
        rootNode.right = buildTree(inorder, root_value_index + 1, iEnd, postorder, pStart + lenth, pEnd - 1);
        return rootNode;
    }
}
