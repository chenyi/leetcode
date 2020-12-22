/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> ans = new ArrayList<Integer>(); 

       inorderTraversal(root, ans);

       return ans;
    }

    public void inorderTraversal(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }

        TreeNode l = root.left;
        TreeNode r = root.right;

        inorderTraversal(l, ans);
        ans.add(root.val);
        inorderTraversal(r, ans);

    }

}
// @lc code=end

