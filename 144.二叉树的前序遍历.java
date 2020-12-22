/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       // recursive
    //    List<Integer> ans = new ArrayList<Integer>();
    //    preorder(root, ans); 
    //    return ans;

        // iterative
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null){
            return ans;
        }

        Stack<TreeNode> s = new Stack<TreeNode>();
        s.add(root);
        while(!s.isEmpty()){
           TreeNode n = s.pop();
           ans.add(n.val);
           TreeNode l = n.left;
           TreeNode r = n.right;
           if(r != null){
            s.push(r);
           }
           if(l != null){
            s.push(l);
           }
        }

        return ans;

    }

    public void preorder(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }

}
// @lc code=end

