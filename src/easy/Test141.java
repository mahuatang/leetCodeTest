package easy;

import java.util.LinkedList;
import java.util.List;

public class Test141 {
    public static void main(String[] args) {

    }

    /**
     * 看题解答案，可以使用快慢指针解决。
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        List<ListNode> listNodes = new LinkedList<>();
        while (head != null) {
            if (listNodes.contains(head)) {
                return true;
            }
            listNodes.add(head);
            head = head.next;
        }
        return false;
    }
}
