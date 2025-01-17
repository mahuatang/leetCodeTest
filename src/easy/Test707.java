package com.cet.matt.model.editor.meta.test;


/**
 *设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 *
 * 在链表类中实现这些功能：
 *
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/design-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 没做出来
 */
public class Test707 {
}

class MyLinkedList {
    Node node = null;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        node = new Node();
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0) {
            return -1;
        }
        int i = 0;
        Node test = node;
        while (i <= index) {
            i++;
            test = test.next;
            if (test == null) {
                return -1;
            }
        }
        return test.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val, null);
        Node test = node.next;
        node.next = newNode;
        newNode.next = test;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node test = node;
        while(test.next != null) {
            test = test.next;
        }
        test.next = new Node(val, null);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        int i = 0;
        Node test = node;
        while (test.next != null) {
            test = test.next;
            i++;
        }
        Node no = new Node(val, null);
        if (i == index) {
            test.next = no;
        } else if (index < 0) {
            addAtHead(val);
        } else if (index < i){
            int j = 0;
            Node test2 = node;
            while(j < index) {
                test2 = test2.next;
                j++;
            }

            Node test3 = test2.next;
            test2.next = no;
            no.next = test3;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int i = 0;
        Node test4 = node;
        while (test4.next != null) {
            test4 = test4.next;
            i++;
        }
        if (i <= index || index < 0) {
            return;
        } else {
            int j = 0;
            Node test5 = node;
            while(j < index) {
                j++;
                test5 = test5.next;
            }
            test5.next = test5.next.next;
        }
    }

    public static void main(String[] args) {
        //["MyLinkedList","addAtHead","get","addAtHead","addAtHead","deleteAtIndex","addAtHead","get","get","get","addAtHead","deleteAtIndex"]
        //[[],[4],[1],[1],[5],[3],[7],[3],[3],[3],[1],[4]]

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(4);
        linkedList.get(1);
        linkedList.addAtHead(1);
        linkedList.addAtHead(5);
        linkedList.deleteAtIndex(3);
        linkedList.addAtHead(7);



        /*MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        System.out.println(linkedList.get(1));         //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        System.out.println(linkedList.get(1));            //返回3*/
    }
}

/**
 * MyLinkedList linkedList = new MyLinkedList();
 * linkedList.addAtHead(1);
 * linkedList.addAtTail(3);
 * linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
 * linkedList.get(1);            //返回2
 * linkedList.deleteAtIndex(1);  //现在链表是1-> 3
 * linkedList.get(1);            //返回3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/design-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class Node {
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node() {

    }
}
