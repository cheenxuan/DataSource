package map;

/**
 * Author: xuanq
 * Create on: 2018-12-23 11:06
 * <p/>
 * Create: map
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

interface Map<K, V> {

    void add(K key,V value);
    V remove(K key);
    boolean contains(K key);
    V get(K key);
    void set(K key,V value);
    int getSize();
    boolean isEmpty();
}
