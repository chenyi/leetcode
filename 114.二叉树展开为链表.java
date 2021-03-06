/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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
    public void flatten(TreeNode root) {
       List<TreeNode> list = new ArrayList<TreeNode>();
       preorder(root, list);//todo

       for(int i = 0; i < list.size(); i++){
         TreeNode node = list.get(i); 
         node.left = null;
         if(i + 1 < list.size()){
           node.right = list.get(i + 1);
         }
       }

    }

    public void preorder(TreeNode root, List<TreeNode> list){
      if(root == null){
        return;
      } 
      list.add(root);
      preorder(root.left, list);
      preorder(root.right, list);
    }
}
// @lc code=end

