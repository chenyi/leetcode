/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while(p != null && p.next != null){
            int n1 = p.val;
            int n2 = p.next.val;
            if(n1 != n2){
              p = p.next;
            }else{
              p.next = p.next.next;
            }

        }
        return head;
    }
}
// @lc code=end

