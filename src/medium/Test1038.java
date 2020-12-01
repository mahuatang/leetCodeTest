package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1038 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(0);
        treeNode.left.right = new TreeNode(2);
        treeNode.left.right.right = new TreeNode(3);

        treeNode.right.left = new TreeNode(5);
        treeNode.right.right = new TreeNode(7);

        treeNode.right.right.right = new TreeNode(8);

        Test1038 test1038 = new Test1038();
        test1038.bstToGst(treeNode);
        System.out.println("hh");
    }

    public TreeNode bstToGst(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        infixOrder(root, list);
        return root;
    }

    public void infixOrder(TreeNode root, List<Integer> list) {
        if (root.right != null) {
            infixOrder(root.right, list);
        }
        TreeNode treeNode = root;
        list.add(treeNode.val);
        treeNode.val = list.stream().collect(Collectors.summingInt(n->n));
        if (root.left != null) {
            infixOrder(root.left, list);
        }
    }

    public void getRestult(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            getRestult(root.left, list);
        }
        TreeNode treeNode = root;
        treeNode.val = list.get(0);
        list.remove(0);
        if (root.right != null) {
            getRestult(root.right, list);
        }

    }

    public List<Integer> resolveList(List<Integer> list) {
        List<Integer> resultList = new ArrayList<>(list.size());

        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            for (int j = i; j < list.size(); j++) {
                sum += list.get(j);
            }
            resultList.add(sum);
        }
        return resultList;
    }
}

