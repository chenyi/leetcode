/*
 * @lc app=leetcode.cn id=563 lang=java
 *
 * [563] 二叉树的坡度
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

    int tilt = 0;

    public int findTilt(TreeNode root) {

        if(root == null){
            return 0;
        }
        dfs(root);
        return tilt;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int sumL = dfs(root.left);
        int sumR = dfs(root.right);
        int sum =  root.val + sumL + sumR;
        tilt = tilt + Math.abs(sumL - sumR);
        return sum;
    } 
}
// @lc code=end

