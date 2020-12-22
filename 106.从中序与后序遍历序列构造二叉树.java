/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int pl = 0;
        int pr = postorder.length - 1;
        int il = 0;
        int ir = inorder.length - 1;
        return buildTree(inorder, postorder, il, ir, pl, pr);

    }

    public TreeNode buildTree(int[] inorder, int[] postorder, int il, int ir, int pl, int pr) {
        if(il > ir){
            return null;
        }

        int rootVal = postorder[pr];
        int im = il;
        while(true){
            if(inorder[im] == rootVal){
               break; 
            }
            im++;
        }
        TreeNode root = new TreeNode(rootVal);
        int leftLength = im - il;
        root.left = buildTree(inorder, postorder, il, im -1, pl, pl + leftLength - 1);
        root.right = buildTree(inorder, postorder, im+1, ir, pl + leftLength, pr -1);
        return root;        
    }


}
// @lc code=end

