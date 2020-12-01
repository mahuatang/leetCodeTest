package mianshiti;

import java.util.ArrayList;
import java.util.List;

public class Test0406 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        TreeNode p = new TreeNode(1);
        Test0406 test0406 = new Test0406();
        TreeNode node = test0406.inorderSuccessor(treeNode, p);
        System.out.println();
    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == p.val) {
                index = i + 1;
                break;
            }
        }

        if (index > list.size()) {
            return null;
        }

        return new TreeNode(Integer.valueOf(list.get(index)));
    }

    public void inorder(TreeNode treeNode, List<Integer> list) {
        if (treeNode.left != null) {
            inorder(treeNode.left, list);
        }

        list.add(treeNode.val);

        if (treeNode.right != null) {
            inorder(treeNode.right, list);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
