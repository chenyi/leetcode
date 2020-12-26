/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null){
            return head;
        }

        ListNode vh = new ListNode(0);
        vh.next = head;

        ListNode p = head;
        ListNode tail = head;
        int size = 0;
        while(p != null){
            size++;
            tail = p;
            p = p.next;
        }

        tail.next = head;  

        int order = size - (k % size);

        p = vh;
        while(order > 0){
            p = p.next;
            order--;
        }
        vh.next = p.next;
        p.next = null;




        return vh.next;
    }
}
// @lc code=end

