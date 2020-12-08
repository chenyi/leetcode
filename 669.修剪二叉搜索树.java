/*
 * @lc app=leetcode.cn id=669 lang=java
 *
 * [669] 修剪二叉搜索树
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
       if(root == null){
         return null;
       }
       int val = root.val;
       if(val >= low && val <= high){
         root.left = trimBST(root.left, low, high);
         root.right = trimBST(root.right, low, high);
         return root;
       } else if(val < low){
         return trimBST(root.right, low, high);
       } else{
         return trimBST(root.left, low, high);
       }
    }
}
// @lc code=end

