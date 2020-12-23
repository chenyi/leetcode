/*
 * @lc app=leetcode.cn id=1448 lang=java
 *
 * [1448] 统计二叉树中好节点的数目
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

    int counter = 0;

    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        int max = root.val;

        dfs(root, max);

        return counter;
    }

    public void dfs(TreeNode root, int max){
        if(root == null){
            return;
        }
        int rv = root.val;
        TreeNode l = root.left;
        TreeNode r = root.right;
        if(rv >= max){
            counter++;
            max = Math.max(rv, max);
        } 
        dfs(l, max);
        dfs(r, max);
    }
}
// @lc code=end

