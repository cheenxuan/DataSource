package set;

/**
 * Author: xuanq
 * Create on: 2018-12-19 21:57
 * <p/>
 * Create: set
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public interface Set<E> {
    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();
}
