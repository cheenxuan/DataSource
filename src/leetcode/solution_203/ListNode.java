package leetcode.solution_203;

/**
 * Author: xuanq
 * Create on: 2018-12-15 21:31
 * <p/>
 * Create: leetcode.listnode
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x){
        val = x;
    }

    public ListNode(int[] arr){
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("arr can not be empty");
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode cur = this;
        while (cur != null){
            result.append(cur.val + "-->");
            cur = cur.next;
        }
        result.append("NULL");
        return result.toString();
    }
}
