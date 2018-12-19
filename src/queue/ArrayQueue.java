package queue;


import array.Array;

/**
 * Author: xuanq
 * Create on: 2018-12-08 13:07
 * <p/>
 * Create: queue
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQueue(){
        array = new Array<E>();
    }

    public ArrayQueue(int capacity){
        array = new Array<E>(capacity);
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue:");
        res.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if(i != array.getSize() - 1){
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
