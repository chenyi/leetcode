/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    public ListNode swapPairs(ListNode head) {
        ListNode vh = new ListNode(0);
        vh.next = head;
        if(head == null){
            return vh.next;
        }

        ListNode l = vh;
        ListNode m = head;
        ListNode r = head.next;
        int count = 0;
        while(m != null && r != null){
            // swap
            ListNode temp = r.next;
            l.next = r;
            r.next = m;
            m.next = temp;


            // move foward
            l = m;
            if(l != null){

              m = l.next;
              if(m != null){
                r = m.next;
              }
            }
            // System.out.println(l.val);
            // System.out.println(m.val);
            // System.out.println(r.val);

            count++;
        }

        System.out.println(count);


        return vh.next;
    }
}
// @lc code=end

