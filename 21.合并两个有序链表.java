/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode tail = new ListNode(0);
       ListNode head = new ListNode(0, tail);

       while(l1 != null && l2 != null){
         int v1 = l1.val;
         int v2 = l2.val;
         if(v1 < v2){
            tail.next = l1;
            l1 = l1.next;
         }else{
            tail.next = l2;
            l2 = l2.next;
         }
         tail = tail.next;
       }
       if(l1 == null){
           tail.next = l2;
       }else{
           tail.next = l1;
       }

       return head.next.next;
    }
}
// @lc code=end

