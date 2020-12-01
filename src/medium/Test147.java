package medium;

import java.util.List;

public class Test147 {
    /**
     * ￥￥￥￥￥￥￥￥￥￥￥￥￥好的解决方法￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥
     public ListNode insertionSortList(ListNode head) {
     // 从头开始找node最适合的位置

     if(head == null) {
     return head;
     }
     // 定义一个虚拟头结点
     ListNode dummyNode = new ListNode(0);
     dummyNode.next = head;

     // 还没排序的节点（待排序的节点），current
     ListNode current = head.next;
     // 排序后链表的尾结点
     ListNode tail = dummyNode.next;
     while(current != null) {
     // 保存下一个待排序的节点
     ListNode nextCurrent = current.next;
     // 比尾结点大，直接的放在尾结点的后面，再更新尾结点
     if(tail.val < current.val) {
     tail.next = current;
     tail = tail.next;
     }else {
     // 进行遍历，找到current正确的位置，并进行交换
     ListNode temp = dummyNode.next;
     ListNode prev = dummyNode;
     while(temp != null) {
     if(current.val < temp.val) {
     tail.next = current.next;
     prev.next = current;
     current.next = temp;
     break;
     }
     prev = temp;
     temp = temp.next;
     }
     }
     // 更新current
     current = nextCurrent;


     }
     return dummyNode.next;

     }
     * @param args
     */


    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(3);
        //insert(listNode, new ListNode(9));
        insertionSortList(listNode);
    }

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode listNode = new ListNode(head.val);
        ListNode a = head.next;

        while(a != null) {
            listNode = insert(listNode, new ListNode(a.val));
            a = a.next;
        }
        return listNode;
    }

    public static ListNode insert(ListNode node, ListNode x) {
        ListNode c = new ListNode(0);
        ListNode m = c;
        ListNode n = node;
        m.next = n;
        while(n != null) {
            if (n.val > x.val) {
                ListNode y = m.next;
                m.next = x;
                x.next = y;
                break;
            }
            m = m.next;
            n = n.next;
        }
        if (n == null) {
            m.next = x;
        }
        return c.next;
    }
}
