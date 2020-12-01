package mianshiti;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * 没哟写出来
 */

/**
 * 抄的答案
 */
public class Test1625 {
    public static void main(String[] args) {
        /*LRUCache cache = new LRUCache(10);


        Node node = new Node(2, 3);
        node.next = new Node(1, 2);
        node.next.next = new Node(3, 4);

        Node cur = node.next;
        cur.next = cur.next.next;
        System.out.println();*/

        /*cache.put(10, 13);
        cache.put(3, 17);
        cache.put(6, 11);
        cache.put(10, 5);
        cache.put(9, 10);
        cache.get(13);
        cache.put(2, 19);
        cache.get(2);
        cache.get(3);
        cache.put(5, 25);
        cache.get(8);
        cache.put(9, 22);
        cache.put(5, 5);
        cache.put(1, 30);
        cache.get(11);
        cache.put(9, 12);
        cache.get(7);
        cache.get(5);
        cache.get(8);
        cache.get(9);
        cache.put(4, 30);
        cache.put(9, 3);
        cache.get(9);
        cache.get(10);
        cache.get(10);
        cache.put(6, 14);
        cache.put(3, 1);
        cache.get(3);
        cache.put(10, 11);
        cache.get(8);
        cache.put(2, 14);
        cache.get(1);
        cache.get(5);
        cache.get(4);*/








        /*cache.put(2,1);
        cache.put(2,2);
        cache.get(2);
        cache.put(1,1);
        cache.put(4,1);
        cache.get(2);*/

        /*cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        cache.get(2);
        cache.put(4, 4);
        cache.get(1);
        cache.get(3);
        cache.get(4);*/

        /*cache.get(2);
        cache.put(2, 6);
        cache.get(1);
        cache.put(1, 5);
        cache.put(1, 2);
        cache.get(1);
        cache.get(2);*/

        /*cache.put(2, 1);
        cache.get(2);
        cache.put(3, 2);
        cache.get(2);
        cache.get(3);*/

      //  LRUCache lruCache = new LRUCache(2);
        /*lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache*/

    }
}

class LRUCache {
    private int capacity;
    private HashMap<Integer,Integer> map;
    private LinkedList<Integer> list;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        list=new LinkedList<>();
    }

    public int get(int key) {
        if(map.containsKey(key)){
            list.remove((Integer)key);
            list.addLast(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            list.remove((Integer)key);
            list.addLast(key);
            map.put(key,value);
            return;
        }
        if(list.size()==capacity){
            map.remove(list.removeFirst());
            map.put(key,value);
            list.addLast(key);
        }
        else{
            map.put(key,value);
            list.addLast(key);
        }
    }
}

/*class LRUCache {
    public int maxSize;
    public int cur;
    public Node node;

    public LRUCache(int capacity) {
        maxSize = capacity;
    }

    public int get(int key) {
        Node cur = node;
        Node help = node;

        while (cur != null) {
            if (cur.key == key) {
                if (cur == node) {
                    return cur.value;
                }
                help.next = help.next.next;
                Node haha = new Node(key, cur.value);
                haha.next = node;
                node = haha;

                return cur.value;
            }
            if (help == cur) {
                cur = cur.next;
            } else {
                cur = cur.next;
                help = help.next;
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cur == maxSize) {
            if (maxSize == 1) {
                node = new Node(key, value);
            } else {
                boolean flag = false;
                Node cc = node;
                Node cc2 = node;
                while(cc != null) {
                    if (cc.key == key) {
                        if (cc2 == node) {
                            node = node.next;
                        } else {
                            cc2.next = cc.next;
                        }

                        flag = true;
                        break;
                    }
                    if (cc == cc2) {
                        cc = cc.next;
                    } else {
                        cc2 = cc2.next;
                        cc = cc.next;
                    }
                }

                if (!flag) {
                    Node cur = node;
                    Node cur2 = node.next;

                    while (cur2.next != null) {
                        cur = cur2;
                        cur2 = cur2.next;
                    }
                    cur.next = null;
                }

                Node n = new Node(key, value);
                if (node == null) {
                    node = n;
                } else {

                    n.next = node;
                    node = n;
                }

            }
        } else {
            cur++;

            Node n = new Node(key, value);
            if (node == null) {
                node = n;
            } else {
                Node cc = node;
                Node cc2 = node;
                while(cc != null) {
                    if (cc.key == key) {
                        cur--;
                        if (cc2 == node) {
                            node = node.next;
                        } else {
                            cc2.next = cc.next;
                        }

                        break;
                    }
                    if (cc == cc2) {
                        cc = cc.next;
                    } else {
                        cc2 = cc2.next;
                        cc = cc.next;
                    }
                }


                n.next = node;
                node = n;
            }
        }


    }
}



class Node {
    public int key;
    public int value;
    public Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}*/
