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

        //original version
    //    ListNode tail = new ListNode(0);
    //    ListNode head = new ListNode(0, tail);

    //    while(l1 != null && l2 != null){
    //      int v1 = l1.val;
    //      int v2 = l2.val;
    //      if(v1 < v2){
    //         tail.next = l1;
    //         l1 = l1.next;
    //      }else{
    //         tail.next = l2;
    //         l2 = l2.next;
    //      }
    //      tail = tail.next;
    //    }
    //    if(l1 == null){
    //        tail.next = l2;
    //    }else{
    //        tail.next = l1;
    //    }

    //    return head.next.next;

        // imroved version using dummy
        //  ListNode dummy = new ListNode(0);
        //  ListNode tail = dummy;
        //  while(l1 != null && l2 != null){
        //     int n1 = l1.val;
        //     int n2 = l2.val;
        //     if(n1 <= n2){
        //         tail.next = l1;
        //         l1 = l1.next;
        //     }else{
        //         tail.next = l2;
        //         l2 = l2.next;
        //     }
        //     tail = tail.next;
        //  }
        //  ListNode rest = (l1 != null? l1 : l2);
        //  tail.next = rest;
        //  return dummy.next;
        
        // recursive version
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        if(l1 == null || l2 == null){
            return (l1 != null ? l1 : l2);
        }else{
            int n1 = l1.val;
            int n2 = l2.val;
            if(n1 <= n2){
                tail = l1;
                l1 = l1.next;
            }else{
                tail = l2;
                l2 = l2.next;
            }
            tail.next = mergeTwoLists(l1, l2);
            return tail;
        }

    }
}
// @lc code=end

