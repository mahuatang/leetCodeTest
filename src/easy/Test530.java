package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test530 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(3);
        treeNode.right = secondNode;
        secondNode.left = new TreeNode(2);
    }

    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int value = list.get(i + 1) - list.get(i);
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public void inorder(TreeNode root, List<Integer> integerList) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorder(root.left, integerList);
        }
        integerList.add(root.val);
        if (root.right != null) {
            inorder(root.right, integerList);
        }
    }
}
