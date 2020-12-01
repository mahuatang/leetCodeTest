package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 *
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 *
 * 计算从根到叶子节点生成的所有数字之和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class Test129 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        /*treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);*/
        Test129 test129 = new Test129();
        test129.sumNumbers(treeNode);
    }

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<List<Integer>> resultList = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> allList = new ArrayList<>();

        pre(root, list, resultList);
        int result = 0;
        for (List<Integer> li : resultList) {
            int sum = 0;
            int m = 1;
            for (int i = li.size() - 1; i >= 0; i--) {
                sum += li.get(i) * m;
                m *= 10;
            }
            result += sum;
        }
        return result;
    }

    public void pre(TreeNode treeNode, List<Integer> list, List<List<Integer>> resultList) {
        if (treeNode.left == null && treeNode.right == null) {
            list.add(treeNode.val);
            resultList.add(list.stream().collect(Collectors.toList()));
            list.remove(list.size() - 1);
        } else {
            list.add(treeNode.val);
            if (treeNode.left != null) {
                pre(treeNode.left, list, resultList);
            }
            if (treeNode.right != null) {
                pre(treeNode.right, list, resultList);
            }
            list.remove(list.size() - 1);
        }
    }
}
