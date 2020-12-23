/*
 * @lc app=leetcode.cn id=1379 lang=java
 *
 * [1379] 找出克隆二叉树中的相同节点
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
    TreeNode ans = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
       dfs(original, cloned, target);  
       return ans;
    }

    public void dfs(TreeNode original, TreeNode cloned, TreeNode target){
        if(original == null){
            return;
        }
        if(original == target){
            ans = cloned;
            return;
        }
        dfs(original.left, cloned.left, target);
        dfs(original.right, cloned.right, target);
    }
}
// @lc code=end

