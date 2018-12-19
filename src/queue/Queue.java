package queue;

/**
 * Author: xuanq
 * Create on: 2018-12-08 13:03
 * <p/>
 * Create: PACKAGE_NAME
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public interface Queue<E> {
    void enqueue(E e);
    E dequeue();
    E getFront();
    int getSize();
    boolean isEmpty();

}
