/*
 * @lc app=leetcode.cn id=965 lang=java
 *
 * [965] 单值二叉树
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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }

        int val = root.val;
        return isUnivalTree(root, val);
    }

    public boolean isUnivalTree(TreeNode root, int val){
        if(root == null){
            return true;
        }
        return root.val == val && isUnivalTree(root.left, val) && isUnivalTree(root.right, val); 
    }
}
// @lc code=end

