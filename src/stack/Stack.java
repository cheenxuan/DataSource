package stack;

/**
 * Author: xuanq
 * Create on: 2018-12-08 11:50
 * <p/>
 * Create: PACKAGE_NAME
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
