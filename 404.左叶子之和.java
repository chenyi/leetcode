/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {

        // if(root == null){
        //     return 0;
        // }
        // int sum = 0;
        // if(root.left != null && root.left.left == null && root.left.right == null ){
        //     return root.left.val;
        // }else{
        //     return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        // }

        AtomicInteger sum = new AtomicInteger(0);
        boolean isLeft = false;
        sumOfLeftLeavesRecursive(root, sum, isLeft);
        return sum.get();
    }

    public void sumOfLeftLeavesRecursive(TreeNode root, AtomicInteger sum, boolean isLeft) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && isLeft){
            sum.addAndGet(root.val);
        }
        sumOfLeftLeavesRecursive(root.left, sum, true);
        sumOfLeftLeavesRecursive(root.right, sum, false);
        
        return;
    }
}
// @lc code=end

