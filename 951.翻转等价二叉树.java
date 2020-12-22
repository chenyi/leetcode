/*
 * @lc app=leetcode.cn id=951 lang=java
 *
 * [951] 翻转等价二叉树
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
       if(root1 == null && root2 == null){
         return true;
       } else if(root1 == null && root2 != null){
         return false;
       }else if(root2 == null && root1 != null){
        return false; 
       }else{
        boolean valEqual = (root1.val == root2.val);
        boolean llEqual = flipEquiv(root1.left, root2.left);
        boolean rrEqual = flipEquiv(root2.right, root1.right);
        boolean lrEqual = flipEquiv(root1.left, root2.right);
        boolean rlEqual = flipEquiv(root1.right, root2.left);
        return valEqual && ((llEqual && rrEqual) || (lrEqual && rlEqual));//todo
       }
    }
}
// @lc code=end

