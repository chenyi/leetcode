/*
 * @lc app=leetcode.cn id=671 lang=java
 *
 * [671] 二叉树中第二小的节点
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
    // int ans = -1;

    public int findSecondMinimumValue(TreeNode root) {
        // int min = root.val;
        // dfs(root, min);
        // return ans;


        int min = root.val;
        return minLR(root, min);

    }

    public int minLR(TreeNode root, int min){
        if(root == null){
            return -1;
        }
        if(root.val > min){
            return root.val;
        }
        int lv = minLR(root.left, min);
        int rv = minLR(root.right, min);
        if(lv > min && rv > min){
            return Math.min(lv, rv);
        }else if(lv > min){ 
            return Math.max(lv, min);
        }else if(rv > min){
            return Math.max(rv, min);
        }else{
            return -1;
        }
    }

    // public void dfs(TreeNode root, int min){
    //     if(root == null){
    //         return;
    //     }

    //     int val = root.val;
    //     if(val > min){
    //         if(ans == -1){
    //             ans = val;
    //         }else{
    //             ans = Math.min(ans, val);
    //         }
    //     }
    //     dfs(root.left, min);
    //     dfs(root.right, min);
    // }
}
// @lc code=end

