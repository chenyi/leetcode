/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode t = new TreeNode(0);
        if(t1 != null && t2 != null){
           t.val = t1.val + t2.val; 
           t.left = mergeTrees(t1.left, t2.left);
           t.right = mergeTrees(t1.right, t2.right);
        }else if(t1 != null){
            t.val = t1.val;
            t.left = t1.left;
            t.right = t1.right;
        }else if(t2 != null){
            t.val = t2.val;
            t.left = t2.left;
            t.right = t2.right;
        }else{
            t = null;
        }
        return t;
    }
}
// @lc code=end

