/*
 * @lc app=leetcode.cn id=623 lang=java
 *
 * [623] 在二叉树中增加一行
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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1){
            TreeNode layer = new TreeNode(v);
            layer.left = root;
            return layer;
        }

        int depth = 1;
        dfs(root, depth, d, v );
        return root;
    }

    public void dfs(TreeNode root, int depth, int d, int v){

        if(root == null){
            return;
        }

        if(depth == d -1){
            TreeNode l = root.left;
            TreeNode r = root.right;
            root.left = new TreeNode(v);
            root.right = new TreeNode(v);
            if(l != null){
                root.left.left = l;
            }
            if(r != null){
                 root.right.right = r; 
            }
            return;
        }

       dfs(root.left, depth + 1, d, v);
       dfs(root.right, depth +1, d, v);
    }
}
// @lc code=end

