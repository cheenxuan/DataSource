package array;

/**
 * Author: xuanq
 * Create on: 2018-12-06 22:18
 * <p/>
 * Create: Array 数组类
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class Array<E> {

    private E[] data;
    private int size;

    /**
     * 构造函数，传入数组的容量capacity构造Array
     *
     * @param capacity 容量
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 无参数的构造函数，默认数组的容量capacity 为 10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中的元素个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组的容量
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 返回数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 想所有元素后添加一个新元素
     *
     * @param e
     */
    public void addLast(E e) {

        add(size, e);
    }

    /**
     * 在所有元素前添加一个元素
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 获取index索引位置的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get Failed, Index is Illegal");
        return data[index];
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set Failed, Index is Illegal");
        data[index] = e;
    }

    public E getLast(){
        return get(size - 1);
    }

    public E getFirst(){
        return get(0);
    }

    /**
     * 在弟index个位置插入一个新元素
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (size == data.length)
            throw new IllegalArgumentException("AddLast failed, Array is full");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add Failed, Require index > 0 or index < size");

        if (size == data.length / 2)
            resize(2 * data.length);

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    /**
     * 重新调整数组长度
     *
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    /**
     * 查找数组中是否有元素e
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return true;
        }
        return false;
    }

    /**
     * 查找某个元素 如果存在就返回index 没有的话就返回-1
     *
     * @param e
     * @return
     */
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    /**
     * 删除某个元素 并且返回删除的元素
     *
     * @param index
     */
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove Failed, Index is Illegal");
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;

        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }

        return ret;
    }

    /**
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 从数组中删除最后一个元素，返回删除的元素
     *
     * @return
     */
    public E removeLast() {
        return remove(size -1);
    }

    /**
     * 从数组中删除某个元素
     *
     * @param e
     */
    public boolean removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }


    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d, capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }
}
