package mianshiti;


//算法复杂度过高

/**
 * 优化算法：
 *
 *
 *  int p=0;
 * 	for(int i=2;i<=n;i++)
 *        {
 * 		p=(p+m)%i;
 *    }
 * 	return p;
 */
public class Test62 {
    public static void main(String[] args) {
        int n = 70866;
        int m = 116922;
        Test62 test62 = new Test62();
        int i = test62.lastRemaining(n, m);
        System.out.println();
    }

    public int lastRemaining(int n, int m) {
        if (n <= 1) {
            return 0;
        }
        Node62 head = new Node62(0);
        Node62 cur = head;
        for (int i = 1; i < n; i++) {
            Node62 node62 = new Node62(i);
            cur.next = node62;
            cur = cur.next;
        }
        cur.next = head;

        Node62 pre = cur;

        while(pre.next != pre) {
            int i = 0;
            while(i < m - 1) {
                pre = pre.next;
                i++;
            }

            pre.next = pre.next.next;

        }

        return pre.val;
    }
}

class Node62 {
    public int val;
    public Node62 next;

    public Node62(int val) {
        this.val = val;
    }
}
