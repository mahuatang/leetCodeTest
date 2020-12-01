package medium;

public class Test116 {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.next = null;

        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.next = null;
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.right.next = null;

        node.left.left.left = null;
        node.left.left.right = null;
        node.left.left.next = null;

        node.left.right.left = null;
        node.left.right.right = null;
        node.left.right.next = null;

        node.right.left.left = null;
        node.right.left.right = null;
        node.right.left.next = null;

        node.right.right.left = null;
        node.right.right.right = null;
        node.right.right.next = null;

        Test116 test116 = new Test116();

        test116.connect(node);

        System.out.println("hh");
    }

    public Node connect(Node root) {
        if (root == null || root.left == null) {
            return root;
        }

        root.left.next = root.right;
        if (root.next != null) {
            root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);

        return root;
    }


}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
