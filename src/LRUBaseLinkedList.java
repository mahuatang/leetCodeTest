import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @description:
 * 用单链表实现LRU算法
 *  （LRU是Least Recently Used的缩写，即最近最少使用，是一种常用的页面置换算法，
 *   选择最近最久未使用的页面予以淘汰。该算法赋予每个页面一个访问字段，用来记录一个
 *   页面自上次被访问以来所经历的时间 t，当须淘汰一个页面时，选择现有页面中其 t 值
 *   最大的，即最近最少使用的页面予以淘汰）
 * @author: zilong
 * @create: 2020-09-02
 */
public class LRUBaseLinkedList<T> {

    private final static Integer DEFAULT_CAPACITY = 10;

    private Integer capacity ;

    private Integer length;

    private SNode <T> headNode;

    public LRUBaseLinkedList() {
        this.headNode = new SNode<T>();
        this.capacity = DEFAULT_CAPACITY;
        this.length = 0;
    }

    public LRUBaseLinkedList(Integer capacity) {
        this.headNode = new SNode<T>();
        this.capacity = capacity;
        this.length = 0;
    }


    public class SNode<T>{

        private T element;

        private SNode next;

        public SNode() {
            this.next = null;
        }

        public SNode(T element){
            this.element = element;
        }

        public SNode(T element, SNode next){
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public SNode getNext() {
            return next;
        }

        public void setNext(SNode next) {
            this.next = next;
        }
    }


    /**
     * 获取查找到元素的前节点（如果链表里有这个元素）
     * @param data
     * @return
     */
    private SNode findPreNode(T data){
        SNode node = headNode;
        while (node.getNext() != null){
            if(data.equals(node.getNext().getElement())){
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    /**
     * 删除preSNode的下一个元素（也就是链表中有这个元素）
     */
    private void deleteElemOptim(SNode preSNode){
        SNode tmp = preSNode.getNext();
        preSNode.setNext(tmp.getNext());
        tmp = null;
        length--;
    }

    /**
     * 在链表头部插入节点
     * @param data
     */
    private void insertElemAtBegin(T data){
        SNode next = headNode.getNext();
        headNode.setNext(new SNode(data,next));
        length++;
    }

    /**
     * 删除尾结点
     */
    private void deleteElemAtEnd(){
        SNode node = headNode;
        if(node.getNext() == null){
            return;
        }
        while (node.getNext().getNext() != null){
            node = node.getNext();
        }
        SNode tmp = node.getNext();
        node.setNext(null);
        tmp = null;
        length--;
    }

    public void add(T data){
        SNode preNode = findPreNode(data);

        //如果元素之前就在链表中存在的话
        if(preNode != null){
            //删除元素
            deleteElemOptim(preNode);
        }else {
            if (length >= this.capacity) {
                deleteElemAtEnd();
            }
        }
        insertElemAtBegin(data);
    }

    private void printAll() {
        SNode node = headNode.getNext();
        while (node != null) {
            System.out.print(node.getElement() + ",");
            node = node.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRUBaseLinkedList list = new LRUBaseLinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            list.add(sc.nextInt());
            list.printAll();
        }
    }



}
