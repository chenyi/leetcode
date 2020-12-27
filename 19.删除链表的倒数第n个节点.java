/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode vh = new ListNode(0);
        vh.next = head;
        Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();        
        map.put(0, vh);
        ListNode p = head;

        int count= 1;
        while(p != null){
            map.put(count, p);
            p = p.next;
            count++;
        }

        int size = map.size() - 1;
        int pre = size -n;
        int next = size - n + 2;

        ListNode preN = map.get(pre);
        ListNode nextN = map.get(next);
        preN.next = nextN;

        return vh.next;
        
    }
}
// @lc code=end

