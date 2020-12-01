package medium;

public class Test24 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

        swapPairs(listNode);
    }

    /**
     * 如何才动了原链表，node.next = XXX改变了原链表的指向就是动了， node = XXX没有改变原链表的指向就是没有动。
     * @param head
     * @return
     */
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        System.out.println();
        while (node != null && node.next != null) {
            ListNode node3 = node.next;
            ListNode node4 = node3.next;
            //会动
            node3.next = node;
            node3.next.next = node4;
            node = node4;
        }
        return node;

        /**不会动
         * if (head == null || head.next == null) {
         *             return head;
         *         }
         *         ListNode node = head;
         *         ListNode headNode = new ListNode(0);
         *         ListNode headNode2 = headNode;
         *         while (node != null && node.next != null) {
         *             ListNode node3 = node.next;
         *             ListNode node4 = node3.next;
         *             node.next = null;
         *             node3.next = node;
         *             node.next = node4;
         *             headNode2.next = node3;
         *             headNode2 = headNode2.next.next;
         *             node = node4;
         *         }
         *         return headNode.next;
         */
    }
}
