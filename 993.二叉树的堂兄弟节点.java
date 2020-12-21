/*
 * @lc app=leetcode.cn id=993 lang=java
 *
 * [993] 二叉树的堂兄弟节点
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
    int dx = 0;
    int dy = 0;
    int px = 0;
    int py = 0;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root.left, 1, x, y, root.val);
        dfs(root.right, 1, x, y, root.val);
        return dx == dy && px != py;
    }

    public void dfs(TreeNode root, int depth, int x, int y, int p){
        if(root == null){
            return;
        }
        if(root.val == x){
            dx = depth;
            px = p;
        }
        if(root.val == y){
            dy = depth;
            py = p;
        }
        TreeNode l = root.left;
        dfs(l, depth + 1, x, y, root.val);
        TreeNode r = root.right;
        dfs(r, depth + 1, x, y, root.val);
    }

}
// @lc code=end

