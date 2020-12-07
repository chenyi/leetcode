/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
    //    return isBalancedNaive(root); 
        return isBalancedOptimized(root);
    }

    public boolean isBalancedOptimized(TreeNode root){
        AtomicBoolean balanced = new AtomicBoolean();
        balanced.set(true);
        if(root == null){
            return balanced.get();
        }else{
            int leftHeight = heightOptimized(root.left, balanced);
            int rightHeight = heightOptimized(root.right, balanced);
            return balanced.get() && Math.abs(leftHeight - rightHeight)  <= 1;
        }
    }

    public int heightOptimized(TreeNode root, AtomicBoolean balanced){
        if(root == null){
            return 0;
        }else{
            int leftHeight = heightOptimized(root.left, balanced);
            int rightHeight = heightOptimized(root.right, balanced);
            if(!balanced.get() || Math.abs(leftHeight - rightHeight) > 1 ){
                balanced.set(false);
                return -1;
            }else{
              return Math.max(leftHeight, rightHeight) +1 ;
            }
        }
    }
    
    public boolean isBalancedNaive(TreeNode root){
        if(root == null){
            return true;
        }
        return Math.abs(heightNaive(root.left) - heightNaive(root.right) ) <= 1 && isBalancedNaive(root.left) && isBalancedNaive(root.right);
    }

    public int heightNaive(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return Math.max(heightNaive(root.left), heightNaive(root.right)) +1 ;
        }
    }
}
// @lc code=end

