/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
    public ListNode partition(ListNode head, int x) {
        ListNode vh1 = new ListNode(0);
        ListNode vh2 = new ListNode(0);

        vh1.next = head;
        ListNode p1 = vh1;
        ListNode p2 = head;
        ListNode p3 = vh2;
        while(p2 != null){
            int v = p2.val;
            if(v < x){

                // move forward

                p1 = p1.next;
                p2 = p1.next; 
            }else{
                // in the bigger link list
                p3.next = p2;
                p3 = p3.next;

                // link the next node
                p1.next = p2.next;
                p2.next = null;
                p2 = p1.next;


            }
        }
        
        

        p1.next = vh2.next;

        return vh1.next;
        // return vh2.next;
    }
}
// @lc code=end

