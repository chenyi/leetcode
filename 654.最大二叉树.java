/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int l, int r) {
        if(l > r){
            return null;
        }
        int max = nums[l];
        int maxP = l;
        int p = l;

        while(p <= r){
            if(nums[p] > max){
                max = nums[p];
                maxP = p;      
            }
            p++;
        }

        TreeNode root = new TreeNode(max);
        root.left = constructMaximumBinaryTree(nums, l, maxP-1);
        root.right = constructMaximumBinaryTree(nums, maxP+1, r);
        return root;
    }
}
// @lc code=end

