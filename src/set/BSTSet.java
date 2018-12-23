package set;

import tree.bst.BST;

/**
 * Author: xuanq
 * Create on: 2018-12-19 22:00
 * <p/>
 * Create: set
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class BSTSet<E extends Comparable<E>> implements Set<E>{

    private BST<E> bst;

    public BSTSet(BST<E> bst) {
        this.bst = new BST<E>();
    }

    @Override
    public void add(E e) {
        bst.addElement(e);
    }

    @Override
    public void remove(E e) {
        bst.removeElement(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
