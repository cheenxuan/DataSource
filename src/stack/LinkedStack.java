package stack;

import linkedlist.LinkedList;

/**
 * Author: xuanq
 * Create on: 2018-12-08 15:40
 * <p/>
 * Create: stack
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class LinkedStack<E> implements Stack<E> {

    private LinkedList<E> linkedList;

    public LinkedStack(){
        linkedList = new LinkedList();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(linkedList);
        return res.toString();

    }
}
