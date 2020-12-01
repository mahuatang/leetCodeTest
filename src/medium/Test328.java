package medium;

import java.util.List;

public class Test328 {
    /**
     * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
     *
     *     请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
     //   head.next.next.next.next.next.next.next.next = new ListNode(9);
        oddEvenList(head);
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode a = head;
        ListNode b = head.next;
        ListNode result = new ListNode(0);
        ListNode resultB = new ListNode(0);
        result.next =resultB;
        ListNode flag1 = result;
        ListNode flag2 = resultB;

        while(a != null) {
            ListNode c = null;
            if (b != null) {
                c = b.next;
            }

            flag1.next = a;
            flag2.next = b;
            flag1 = flag1.next;
            flag2 = flag2.next;
            if (c == null) {
                break;
            }
            a = c;
            b = c.next;
        }
        a.next = resultB.next;
        return result.next;

    }
}
