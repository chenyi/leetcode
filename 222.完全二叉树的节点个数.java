/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lh = h(root.left);
        int rh = h(root.right);
        if(lh == rh){
            return 1+ ((1 << lh) - 1) + countNodes(root.right);
        }else{
            return 1 + ((1 << rh) -1) + countNodes(root.left);
        }
    }

    public int h(TreeNode root){
        if(root == null){
            return 0;
        }
        int h = 0;
        TreeNode t = root;
        while(t != null){
            h = h +1;
            t = t.left;
        }

        return h;
    }
}
// @lc code=end

