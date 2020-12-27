/*
 * @lc app=leetcode.cn id=1019 lang=java
 *
 * [1019] 链表中的下一个更大节点
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
    public int[] nextLargerNodes(ListNode head) {
        
        List<Integer> list = new ArrayList<Integer>();
        ListNode p = head;
        while(p != null){
            list.add(p.val);
            p = p.next;
        }
        int size = list.size();
        int[] ans = new int[size];
        for(int i = 0; i < size; i++){
            ans[i] = 0;
        }

        //for index reverse store
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < size; ){
            int n = list.get(i);
            if(stack.isEmpty()){
                // the first one
                stack.push(i);
            }else{
                // the max undetermined index
                int topI = stack.peek();
                // the max undetermined num
                int top = list.get(topI);
                // the new number is bigger than the undetermined one
                if(n > top){
                    ans[topI] = n;
                    stack.pop();
                }else{
                    stack.push(i);
                    i++;
                }
            }

        }


        return ans;
    }
}
// @lc code=end

