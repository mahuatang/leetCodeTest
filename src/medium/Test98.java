package medium;

import java.util.ArrayList;
import java.util.List;

public class Test98 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(4);

     //   treeNode.left.left = new TreeNode(0);
     //   treeNode.left.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        treeNode.right.right = new TreeNode(6);

        Test98 test98 = new Test98();
        boolean xx = test98.isValidBST(treeNode);

        System.out.println("hh");

    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        isValidBST(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void isValidBST(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        isValidBST(root.left, list);

        list.add(root.val);

        isValidBST(root.right, list);

    }


    /*public boolean isValidBST(TreeNode root) {
        Stack<Integer> stack = new Stack<>();
        return isValidBST(root, stack);
    }

    public boolean isValidBST(TreeNode root, Stack<Integer> stack) {
        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if(!isValidBST(root.left, stack)) {
                return false;
            }
        }

        if (!stack.isEmpty()) {
            Integer lastData = stack.peek();
            if(lastData != null && lastData >= root.val) {
                return false;
            }
        }
        stack.push(root.val);

        if (root.right != null) {
            if(!isValidBST(root.right, stack)) {
                return false;
            }
        }
        return true;
    }*/


    /**
     *
     *
     * 不能以根结点为边界值做判断，一旦左右一转换就game over
     *
     */


    /*public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && root.left.val >= root.val) {
            return false;
        }

        if (root.right != null && root.right.val <= root.val) {
            return false;
        }

        if (isValidBSTLeft(root.left, root.val) && isValidBSTRIght(root.right, root.val)) {
            return true;
        }
        return false;
    }

    public boolean isValidBSTRIght(TreeNode root, int rootValue) {
        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if (root.left.val >= root.val || root.left.val <= rootValue) {
                return false;
            }
            if(!isValidBSTRIght(root.left, rootValue)) {
                return false;
            }
        }

        if (root.right != null) {
            if (root.val >= root.right.val) {
                return false;
            }
            if (!isValidBSTRIght(root.right, rootValue)) {
                return false;
            }
        }

        return true;
    }

    public boolean isValidBSTLeft(TreeNode root, int rootValue) {
        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if (root.left.val >= root.val) {
                return false;
            }
            if(!isValidBSTLeft(root.left, rootValue)) {
                return false;
            }
        }

        if (root.right != null) {
            if (root.val >= root.right.val || root.right.val >= rootValue) {
                return false;
            }
            if (!isValidBSTLeft(root.right, rootValue)) {
                return false;
            }
        }

        return true;
    }*/
}
