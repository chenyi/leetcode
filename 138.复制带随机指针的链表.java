/*
 * @lc app=leetcode.cn id=138 lang=java
 *
 * [138] 复制带随机指针的链表
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Node vh1 = new Node(0); 
       Node vh2 = new Node(0);
       vh1.next = head;

       Node p1 = vh1.next;
       Node p2 = vh2;

       Map<Node, Node> map = new HashMap<Node, Node>();

       while(p1 != null){


           int v1 = p1.val;
           Node node = new Node(v1);
           map.put(p1, node);
           
           p2.next = node;
           p2 = p2.next;


           p1 = p1.next;

       }

       p2 = vh2.next;
       p1 = vh1.next;
       while(p1 != null && p2 != null){

         Node r1 = p1.random;
         if(r1 != null){
            Node r2 = map.get(r1);
            p2.random = r2;
         }

         p1 = p1.next;
         p2 = p2.next;
       }




       return vh2.next;
    }
}
// @lc code=end

