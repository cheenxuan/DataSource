package leetcode.solution_203;

/**
 * Author: xuanq
 * Create on: 2018-12-16 10:48
 * <p/>
 * Create: leetcode.solution_203
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class Solution_203_2 {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null)
             return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        System.out.println((new Solution_203_2()).removeElements(head, 6));
    }
}
