package mianshiti;

public class Test0205 {
    public static void main(String[] args) {
        /*ListNode l1 = new ListNode(7);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(6);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(2);*/

        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(7);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(0);
        l1.next.next.next.next = new ListNode(8);
        l1.next.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next.next = new ListNode(8);
        l1.next.next.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next.next.next = new ListNode(7);
        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(5);
        l2.next.next.next.next = new ListNode(6);
        l2.next.next.next.next.next = new ListNode(8);
        l2.next.next.next.next.next.next = new ListNode(3);
        l2.next.next.next.next.next.next.next = new ListNode(5);
        l2.next.next.next.next.next.next.next.next = new ListNode(7);
//        l2.next.next.next.next.next.next.next.next.next.next = new ListNode(9);

        Test0205 test0205 = new Test0205();
        test0205.addTwoNumbers(l2, l1);

        System.out.println();

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l1.next == null) {
            return l2;
        }
        if (l2.val == 0 && l2.next == null) {
            return l1;
        }

        int haha = 0;
        ListNode head = new ListNode(0);
        ListNode cur = head;

        while(l1 != null || l2 != null) {
            int val = 0;
            if (l1 != null) {
                val += l1.val;
            }

            if (l2 != null) {
                val += l2.val;
            }

            val += haha;

            if (val >= 10) {
                haha = 1;
                val = val % 10;
            } else {
                haha = 0;
            }

            ListNode listNode = new ListNode(val);
            cur.next = listNode;
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (haha == 1) {
            ListNode listNode = new ListNode(haha);
            cur.next = listNode;
        }

        return head.next;
    }

    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0) {
            return l2;
        }
        if (l2.val == 0) {
            return l1;
        }

        double result = conveterNodeToInt(l1) + conveterNodeToInt(l2);
        ListNode node = new ListNode(0);
        ListNode head = node;
        while(result >= 1) {
            int x = (int)(result % 10);
            node.next = new ListNode(x);
            node = node.next;
            result = result / 10;
        }

        return head.next;
    }

    public double conveterNodeToInt(ListNode l) {
        int haha = 1;
        double sum = 0;

        while(l != null) {
            sum += l.val * haha;
            haha *= 10;
            l = l.next;
        }

        return sum;
    }*/
}

class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}
