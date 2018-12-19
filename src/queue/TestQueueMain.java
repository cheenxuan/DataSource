package queue;

/**
 * Author: xuanq
 * Create on: 2018-12-08 16:21
 * <p/>
 * Create: queue
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class TestQueueMain {
    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<Integer>();
        for (int i = 0; i < 10; i++) {
            linkedQueue.enqueue(i);
            System.out.println(linkedQueue);

            if(i % 3 ==2){
                linkedQueue.dequeue();
                System.out.println(linkedQueue);
            }
        }
    }
}
