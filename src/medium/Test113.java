package medium;

import java.util.ArrayList;
import java.util.List;

public class Test113 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);

        treeNode.left = new TreeNode(4);
        treeNode.left.left = new TreeNode(11);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.right = new TreeNode(2);

        treeNode.right = new TreeNode(8);
        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.left = new TreeNode(5);
        treeNode.right.right.right = new TreeNode(1);

        Test113 test113 = new Test113();
        test113.pathSum(treeNode, 22);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        if (root == null) {
            return list;
        }
        pathSum(root, integerList, 0, sum, list);
        return list;
    }

    public void pathSum(TreeNode root, List<Integer> integers, int sum1, int sum2, List<List<Integer>> list) {
        if (root.left == null && root.right == null) {
            if (sum1 + root.val == sum2) {
                integers.add(root.val);
                list.add(integers);
            }
            return;
        }
        int temp = sum1;
        List<Integer> tempList = new ArrayList<>();
        for(Integer i : integers) {
            tempList.add(i);
        }

        if (root.left != null) {
            sum1 += root.val;
            integers.add(root.val);
            pathSum(root.left, integers, sum1, sum2, list);
        }
        sum1 = temp;
        integers = tempList;
        if (root.right != null) {
            sum1 += root.val;
            integers.add(root.val);
            pathSum(root.right, integers, sum1, sum2, list);
        }
    }
}
