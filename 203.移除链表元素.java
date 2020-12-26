/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode vh = new ListNode(0);
        vh.next = head;
        ListNode p = vh;

        while(p != null){
            ListNode np = p.next;
            if(np != null){
                if(np.val == val){
                    p.next = np.next;
                    continue;
                }
            }
            p = p.next;
        }

        return vh.next;

    }
}
// @lc code=end

