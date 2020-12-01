package medium;

public class Test19 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        ListNode listNode = removeNthFromEnd2(l1, 2);
        System.out.println();

    }

    //通用解法：双指针
    public ListNode removeNthFromEnd666(ListNode head, int n) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode fast = res;
        ListNode slow = res;

        while (n-- > 0){
            fast = fast.next;
        }
        //为了找到要删除的节点的前一个节点，所以此处让fast.next!=null
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //此时slow为倒数第n个节点的前一个节点。
        slow.next = slow.next.next;
        return res.next;

    }

    ///最优秀的解法
    int i;
    public ListNode removeNthFromEnd333(ListNode head, int n) {
        if(head == null){
            i=0;
            return null;
        }
        head.next = removeNthFromEnd(head.next,n);
        i++;
        if(i==n) return head.next;
        return head;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        int count = 1;
        ListNode cc = head;
        while (cc.next != null) {
            count++;
            cc = cc.next;
        }
        int i = 0;
        ListNode temp = head;
        if (count - n == 0) {
            return head.next;
        } else {
            while(i < count - n - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            return head;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode help = revrseNode(head);
        int x = 0;
        ListNode first = help;

        if (n == 1) {
            return revrseNode(first.next);
        }
        while(x < n - 2) {
            first = first.next;
            x++;
        }

        first.next = first.next.next;
        return revrseNode(help);

    }

    public static ListNode revrseNode(ListNode head) {
        ListNode temp = head;
        ListNode help = new ListNode(0);

        while(temp != null) {
            ListNode node = new ListNode(temp.val);
            ListNode cc = help.next;
            help.next = node;
            node.next = cc;
            temp = temp.next;
        }

        return help.next;
    }
}
