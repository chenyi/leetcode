/*
 * @lc app=leetcode.cn id=1290 lang=java
 *
 * [1290] 二进制链表转整数
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
    public int getDecimalValue(ListNode head) {
        ListNode p = head;
        int sum = 0;
        while(p != null){
            int val = p.val;
            sum = sum * 2 + val;
            p = p.next;
        }
        return sum;
    }
}
// @lc code=end

