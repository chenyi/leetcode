/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        boolean ans = true;
        Stack<ListNode> stack = new Stack<ListNode>();

        ListNode p = head;
        while(p != null){
            stack.add(p);
            p = p.next;
        }

        p = head;
        while(p != null){
            int val = p.val;
            int rval = stack.pop().val;
            if(val != rval){
                return false;
            }
            p = p.next;
        }

        return ans;

    }
}
// @lc code=end

