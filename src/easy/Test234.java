package easy;

public class Test234 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(2);
        listNode.next.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(listNode));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int sum = 1;
        ListNode listNode = head;
        while (listNode.next != null) {
            sum++;
            listNode = listNode.next;
        }
        listNode = head;
        int i = 1;
        if (sum % 2 == 0) {
            while(i++ <=  sum / 2) {
                listNode = listNode.next;
            }
        } else {
            while(i++ <=  sum / 2 + 1) {
                listNode = listNode.next;
            }
        }

        ListNode listNode1 = new ListNode(0);
        ListNode listNode4 = listNode1;
        ListNode listNode2 = listNode;
        while (listNode2 != null) {
            ListNode listNode3 = listNode4.next;
            listNode4.next = listNode2;
            listNode = listNode.next;
            listNode4.next.next = listNode3;
            listNode2 = listNode;
            listNode4 = listNode1;
        }
        listNode1 = listNode1.next;
        while (listNode1 != null) {
            if (listNode1.val != head.val) {
                return false;
            }
            listNode1 = listNode1.next;
            head = head.next;
        }
        return true;
    }
}
