package medium;

public class Test143 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        reorderList(node);
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        ListNode node = head;
        ListNode node32 = node2;
        int i = 0;

        while(node != null) {
            i++;
            node32.next = new ListNode(node.val);
            node32 = node32.next;
            node32.next = null;
            ListNode node3 = node.next;
            node.next = node1.next;
            node1.next = node;
            node = node3;
        }
        ListNode resultNode = head;
        ListNode endNode = head;
        int j = i % 2 == 0 ? i / 2 : i / 2 + 1;
        int x = j;
        while (j-- > 0) {
            //    ListNode nodeA = node2.next;
            if (j == 0 && i % 2 != 0) {
                endNode.next = new ListNode(node2.next.val);
                break;
            }
            if (x - 1 == j) {
                endNode.next = new ListNode(node1.next.val);
                node1 = node1.next;
                node2 = node2.next;
                endNode = endNode.next;
                continue;
            }
            endNode.next = new ListNode(node2.next.val);
            endNode.next.next = new ListNode(node1.next.val);
            node1 = node1.next;
            node2 = node2.next;
            endNode = endNode.next.next;
        }
    }

    /**
     *     if (head == null) {
     *             return;
     *         }
     *
     *         Deque<ListNode> deque = new LinkedList<>();
     *
     *         ListNode next = head.next;
     *         while (next != null) {
     *             deque.add(next);
     *             next = next.next;
     *         }
     *
     *         while (!deque.isEmpty()) {
     *             head.next = deque.pollLast();
     *             head = head.next;
     *
     *             if (!deque.isEmpty()) {
     *                 head.next = deque.pollFirst();
     *                 head = head.next;
     *             }
     *         }
     *
     *         head.next = null;
     *
     */
}
