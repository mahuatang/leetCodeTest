package easy;

public class Test206 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode help = head;
        ListNode next = help.next;

        ListNode pre = new ListNode(0);
        ListNode oo;

        while (help != null) {
            oo = pre.next;
            pre.next = help;
            pre.next.next = oo;
            help = next;
            if (help != null) {
                next = help.next;
            }
        }

        return pre.next;
    }
}
