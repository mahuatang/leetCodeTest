package medium;

public class Test2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
       // l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(0);
     //   l2.next = new ListNode(6);
     //   l2.next.next = new ListNode(4);

        ListNode aa = addTwoNumbers(l1, l2);

        System.out.println('c');
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) l1 = new ListNode(0);
        l1.val += l2 == null ? 0 : l2.val;
        if (l1.val > 9) {
            l1.val = l1.val % 10;
            if (l1.next == null)
                l1.next = new ListNode(1);
            else
                l1.next.val += 1;
            l1.next = addTwoNumbers(l1.next, l2 == null ? null : l2.next);
        } else {
            l1.next = addTwoNumbers(l1.next, l2 == null ? null : l2.next);
        }
        return l1;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
