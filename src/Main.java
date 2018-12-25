import java.util.Random;

import queue.Queue;
import stack.Stack;


public class Main {

    //测试使用q运行opCount个enqueue和dequeue操作所需要的时间 单位：秒
    private static double testQueue(Queue<Integer> q, int opCount) {

        long startTime = System.nanoTime();

        Random random = new Random();
        //doString
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    //测试使用q运行opCount个enqueue和dequeue操作所需要的时间 单位：秒
    private static double testStack(Stack<Integer> q, int opCount) {

        long startTime = System.nanoTime();

        Random random = new Random();
        //doString
        for (int i = 0; i < opCount; i++) {
            q.push(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < opCount; i++) {
            q.pop();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        // int opCount = 100000;
        //
        // LinkedStack<Integer> stack = new LinkedStack<Integer>();
        // double time1 = testStack(stack,opCount);
        // System.out.println("LinkedStack: time: " + time1 + " s");
        //
        // ArrayStack<Integer> stack2 = new ArrayStack<Integer>();
        // double time2 = testStack(stack2,opCount);
        // System.out.println("ArrayStack: time: " + time2 + " s");


        // BST<Integer> bst = new BST<Integer>();
        // int[] nums = {5,3,6,8,4,2};
        // for (int num : nums) {
        //     bst.addElement(num);
        // }
        //
        // bst.preOrder();
        //
        // bst.preOrderNR();
        //
        // bst.levelOrder();

        // BST<Integer> bst = new BST<Integer>();
        // Random random = new Random();
        //
        // int n = 10;
        //
        // for (int i = 0; i < n; i++) {
        //     bst.addElement(n + i);
        // }
        // ArrayList<Integer> nums = new ArrayList<Integer>();
        // while (!bst.isEmpty()) {
        //     bst.removeElement(15);
        //     nums.add(bst.removeMin());
        // }
        // System.out.println(nums);


        // ArrayList<Integer> nums = new ArrayList<Integer>();
        // while (!bst.isEmpty()) {
        //     nums.add(bst.removeMin());
        // }
        //
        // System.out.println(nums);
        //
        // for (int i = 1; i < nums.size(); i++) {
        //     if (nums.get(i - 1) > nums.get(i))
        //         throw new IllegalArgumentException("Error");
        // }
        // System.out.println("removeMin test completed!");


        System.out.println(sumValue(10,20) + "");

    }

    public static int i = 1;

    public static int sumValue(int n,int m) {
        int a1 = 1;
        int a2 = 1;

        if(n <= m){
            return sum(a1, a2, n);
        }else{
            throw new IllegalArgumentException("n is IllegalNumber");
        }

    }

    private static int sum(int a1, int a2, int k) {
        if (i < k - 2) {
            i++;
            return sum(a2, a1 + a2, k);
        } else {
            return a1 + a2;
        }
    }
}
