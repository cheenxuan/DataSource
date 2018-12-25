package set;


import linkedlist.LinkedList;

/**
 * Author: xuanq
 * Create on: 2018-12-19 22:37
 * <p/>
 * Create: set
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class LinkListSet<E> implements Set<E>  {

    private LinkedList<E> linkedList;

    public LinkListSet(LinkedList<E> linkedList) {
        this.linkedList = new LinkedList<E>();
    }

    @Override
    public void add(E e) {
        if(!linkedList.contains(e)){
            linkedList.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {
        linkedList.removeElement(e);
    }

    @Override
    public boolean contains(E e) {
        return linkedList.contains(e);
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
