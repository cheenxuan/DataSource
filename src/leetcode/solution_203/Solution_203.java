package leetcode.solution_203;

/**
 * Author: xuanq
 * Create on: 2018-12-15 21:30
 * <p/>
 * Create: leetcode
 * <p/>
 * Description: 删除链表中等于给定值val
 * <p/>
 * Update:
 */

public class Solution_203 {

    public ListNode removeElements(ListNode head,int val){

        while(head != null && head.val == val){
           head = head.next;
        }

        if(head == null) return null;

        ListNode prev = head;
        while(prev.next != null) {

            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,6,3,4,5,6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        System.out.println((new Solution_203()).removeElements(head, 6));
    }
}
