package easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test107 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> list = new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()) {
            List<Integer> integerList = new LinkedList<>();
            List<TreeNode> tempList = new LinkedList<>();
            for (TreeNode treeNode : list) {
                integerList.add(treeNode.val);
                if (treeNode.left != null) {
                    tempList.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    tempList.add(treeNode.right);
                }
            }
            list = tempList;
            result.add(integerList);
        }
        Collections.reverse(result);
        return result;
    }
}
