package linkedlist;

/**
 * Author: xuanq
 * Create on: 2018-12-08 14:33
 * <p/>
 * Create: linkedlist
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class LinkedList<E> {

    /**
     * 链表的节点
     */
    private class Node {

        public Node next;
        public E e;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }



    //获取链表中的元素个数
    public int getSize() {
        return size;
    }

    //返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //在链表头添加新的元素e
    public void addFirst(E e) {
        // Node node = new Node(e);
        // node.next = head;
        // head = node;

        // dummyHead = new Node(e,dummyHead);
        // size++;
        add(0, e);
    }

    //在链表的中间添加新的元素
    public void add(int index, E e) {

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed,Illegal index");

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        // Node node = new Node(e);
        // node.next = prev.next;
        // prev.next = node;

        prev.next = new Node(e, prev.next);
        size++;
    }

    //在链表的末尾添加新的元素
    public void addLast(E e) {
        add(size, e);
    }

    //获取链表的第index个位置的元素
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Illegal Index");

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Illegal Index");

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast(){
        return remove(size -1);
    }

    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Illegal Index");

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;

        return retNode.e;
    }

    public void removeElement(E e){
        Node prev = dummyHead;
        while (prev.next != null){
            if(prev.next.e.equals(e)){
                break;
            }
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        // Node cur = dummyHead.next;
        // while (cur != null){
        //     res.append(cur + "->");
        //     cur = cur.next;·
        // }

        for (Node cur = dummyHead.next; cur != null; cur = cur.next)
            res.append(cur + "->");

        res.append("NULL");

        return res.toString();
    }
}
