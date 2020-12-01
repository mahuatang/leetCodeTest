package mianshiti;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test34 {
    List<List<Integer>> list = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(8);
        treeNode.left.left = new TreeNode(11);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.right = new TreeNode(2);
        treeNode.right = new TreeNode(8);
        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.left = new TreeNode(5);
        treeNode.right.right.right = new TreeNode(1);

        Test34 test34 = new Test34();
        test34.pathSum(treeNode, 22);

    }


    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return list;
        getResult(root, sum);
        return list;
    }

    public void getResult(TreeNode root, int tar) {
        tar -= root.val;
        path.add(root.val);

        if (root.left == null && root.right == null && tar == 0) {
            list.add(new ArrayList<>(path));
        }

        if (root.left != null) {
            getResult(root.left, tar);
        }

        if (root.right != null) {
            getResult(root.right, tar);
        }

        path.removeLast();
    }
}
