package leetcode.solution_203;

/**
 * Author: xuanq
 * Create on: 2018-12-15 21:43
 * <p/>
 * Create: leetcode.solution_203
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class Solution_203_1 {
    public ListNode removeElements(ListNode head,int val){

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while(prev.next != null) {

            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,6,3,4,5,6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        System.out.println((new Solution_203_1()).removeElements(head, 6));
    }
}
