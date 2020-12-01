package easy;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Test160 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);

        ListNode listNode2 = new ListNode(2);
        System.out.println(getIntersectionNode(listNode, listNode2));

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA != null && headB != null) {
            ListNode listNode = headA;
            ListNode listNode2;
            while (listNode != null) {
                listNode2 = headB;
                while (listNode2 != null) {
                    if (listNode.val == listNode2.val) {
                        return listNode;
                    }
                    listNode2 = listNode2.next;
                }
                listNode = listNode.next;
            }
            return null;
        } else {
            return null;
        }
    }
}
