/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
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
    public ListNode middleNode(ListNode head) {
        ListNode sp = head;
        ListNode lp = head;
        while(lp != null && lp.next != null){
            sp = sp.next;
            lp = lp.next.next;
        }
        return sp;
    }
}
// @lc code=end

