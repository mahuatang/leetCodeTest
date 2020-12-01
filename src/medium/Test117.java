package medium;

import java.util.ArrayList;
import java.util.List;

public class Test117 {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.next = null;

        node.left.left = new Node(0);
        node.left.right = new Node(7);
        node.left.next = null;
        node.right.left = new Node(9);
        node.right.right = new Node(1);
        node.right.next = null;

        node.left.left.left = new Node(2);
        node.left.left.right = null;
        node.left.left.next = null;

        node.left.right.left = new Node(1);
        node.left.right.right = new Node(0);
        node.left.right.next = null;

        node.right.left.left = null;
        node.right.left.right = null;
        node.right.left.next = null;

        node.right.right.left = new Node(8);
        node.right.right.right = new Node(8);
        node.right.right.next = null;

        Test117 test117 = new Test117();

        test117.connect(node);

        System.out.println("hh");
    }

    public Node connect(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return null;
        }
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(root);
        while(!nodeList.isEmpty()) {
            List<Node> treeNodeList = new ArrayList<>();
            for (Node node : nodeList) {
                if (node.left != null) {
                    treeNodeList.add(node.left);
                }
                if (node.right != null) {
                    treeNodeList.add(node.right);
                }
            }
            nodeList = treeNodeList;
            if (treeNodeList.size() > 1) {
                for (int i = 0; i < treeNodeList.size() - 1; i++) {
                    treeNodeList.get(i).next = treeNodeList.get(i + 1);
                }
            }
        }
        return root;
        /*if (root == null) {
            return root;
        }

        if (root.right != null && root.right.val == 0) {
            System.out.println("h");
        }

        if(root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                Node temp = root;
                while(temp.next != null) {
                    if (temp.next.left != null || temp.next.right != null) {
                        break;
                    }
                    temp = temp.next;
                }

                if (temp.next != null) {
                    if (temp.next.left != null) {
                        root.left.next = temp.next.left;
                    } else if (temp.next.right != null) {
                        root.left.next = temp.next.right;
                    }
                }
            }
        }

        if (root.right != null) {
            Node temp = root;
            while(temp.next != null) {
                if (temp.next.left != null || temp.next.right != null) {
                    break;
                }
                temp = temp.next;
            }

            if (temp.next != null) {
                if (temp.next.left != null) {
                    root.right.next = temp.next.left;
                } else if (temp.next.right != null) {
                    root.right.next = temp.next.right;
                }
            }
        }

        connect(root.left);
        connect(root.right);

        return root;*/
    }
}
