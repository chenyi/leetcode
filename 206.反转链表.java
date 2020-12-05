/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
        // return reverseList(null, head);
    }

    // public ListNode reverseList(ListNode pre, ListNode current) {
    //     if(current == null){
    //         return pre;
    //     }else{
    //         ListNode next = current.next;
    //         current.next = pre;
    //         return reverseList(current, next);
    //     }
    // }
}
// @lc code=end

