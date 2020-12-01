package medium;

import java.util.ArrayList;
import java.util.List;

public class Test102 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);

        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        Test102 test102 = new Test102();

        test102.levelOrder(treeNode);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);

        while(!nodeList.isEmpty()) {
            List<Integer> dataList = new ArrayList<>();
            List<TreeNode> treeNodeList = new ArrayList<>();
            for (TreeNode node : nodeList) {
                dataList.add(node.val);
                if (node.left != null) {
                    treeNodeList.add(node.left);
                }

                if (node.right != null) {
                    treeNodeList.add(node.right);
                }
            }
            nodeList = treeNodeList;
            list.add(dataList);
        }

        return list;
    }
}
