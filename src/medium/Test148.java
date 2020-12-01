package medium;


/**
 * 没做出来
 *
 * 好的排序方法
 *
 class Solution {
 public ListNode sortList(ListNode head) {
 if (head == null || head.next == null)
 return head;
 ListNode fast = head.next, slow = head;
 while (fast != null && fast.next != null) {
 slow = slow.next;
 fast = fast.next.next;
 }
 ListNode tmp = slow.next;
 slow.next = null;
 ListNode left = sortList(head);
 ListNode right = sortList(tmp);
 ListNode h = new ListNode(0);
 ListNode res = h;
 while (left != null && right != null) {
 if (left.val < right.val) {
 h.next = left;
 left = left.next;
 } else {
 h.next = right;
 right = right.next;
 }
 h = h.next;
 }
 h.next = left != null ? left : right;
 return res.next;
 }
 }
 */
public class Test148 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(-1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);
    }

    public ListNode sortList(ListNode head) {
        /*if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode later = head;
        while(pre.next != null && later.next != null) {
            pre = pre.next;
            later = later.next.next;
        }*/
        return null;



    }
}
