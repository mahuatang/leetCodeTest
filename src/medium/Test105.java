package medium;

public class Test105 {
    public static void main(String[] args) {
        int[] preOrder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};

        Test105 test105 = new Test105();
        TreeNode treeNode = test105.buildTree(preOrder, inorder);

        System.out.println();
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode buildTree(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart == pEnd) {
            return null;
        }
        int root = preorder[pStart];

        TreeNode rootNode = new TreeNode(preorder[pStart]);

        int root_value_index = 0;

        for (int i = iStart; i < iEnd; i++) {
            if (root == inorder[i]) {
                root_value_index = i;
                break;
            }
        }

        int lenth = root_value_index - iStart;

        rootNode.left = buildTree(preorder, pStart + 1, pStart + lenth + 1, inorder, iStart, root_value_index);
        rootNode.right = buildTree(preorder, pStart + lenth + 1, pEnd, inorder, root_value_index + 1, iEnd);
        return rootNode;
    }
}
