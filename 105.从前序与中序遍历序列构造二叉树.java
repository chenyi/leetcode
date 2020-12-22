/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLength = preorder.length;
        int inLength = inorder.length;
        return buildTree(preorder, inorder, 0, preLength - 1, 0, inLength - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int pl, int pr, int il, int ir){
        if(pl >  pr){
            return null;
        }

        int val = preorder[pl];
        TreeNode root = new TreeNode(val);

        int im = il;
        for(int i = il; i <= ir; i++){
            if(val == inorder[i]){
                im = i;
                break;
            }
        }
        int leftLength = im - il;
        
        root.left = buildTree(preorder, inorder, pl + 1, pl + leftLength, il, im - 1);
        root.right = buildTree(preorder, inorder, pl + leftLength + 1, pr, im + 1, ir );
        return root;
    }
}
// @lc code=end

