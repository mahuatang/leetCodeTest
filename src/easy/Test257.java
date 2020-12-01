package easy;

import java.util.LinkedList;
import java.util.List;

public class Test257 {
    public static void main(String[] args) {
        Test257 test257 = new Test257();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(5);
        treeNode.right = new TreeNode(3);
        test257.binaryTreePaths(treeNode);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> strings = new LinkedList<>();
        if (root == null) {
            return strings;
        }
        binaryPaths(strings, "", root);
        return strings;
    }

    public void binaryPaths(List<String> paths, String str, TreeNode root) {
        str += "->" + root.val;
        if (root.left == null && root.right == null) {
            paths.add(str.substring(2));
            return;
        }
        if (root.left != null) {
            binaryPaths(paths, str, root.left);
        }
        if (root.right != null) {
            binaryPaths(paths, str, root.right);
        }
    }
}
