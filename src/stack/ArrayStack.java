package stack;

import array.Array;

/**
 * Author: xuanq
 * Create on: 2018-12-08 11:52
 * <p/>
 * Create: PACKAGE_NAME
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class ArrayStack<E> implements Stack<E> {

    private Array<E> array;

    public ArrayStack(int capacity){
        array = new Array<E>(capacity);
    }

    public ArrayStack(){
        array = new Array<E>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack:");
        res.append("top [");
        for (int i = array.getSize() - 1; i >= 0; i--) {
            res.append(array.get(i));
            if(0 != i){
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }
}
