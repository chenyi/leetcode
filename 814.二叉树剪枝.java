/*
 * @lc app=leetcode.cn id=814 lang=java
 *
 * [814] 二叉树剪枝
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
    public TreeNode pruneTree(TreeNode root) {
        Set<TreeNode> set = new HashSet<TreeNode>();
       dfs(root, set);
       System.out.println(set.size());

       if(set.contains(root)){
           root = null;
       }else{
         remove(root, set);
       }
       return root;
    }

    public void remove(TreeNode root, Set<TreeNode> set){
        if(root == null){
            return;
        }

        TreeNode l = root.left;
        TreeNode r = root.right;
      
        if(l != null && set.contains(l)){
            root.left = null;
        }else{
            remove(l, set);
        }

        if(r != null && set.contains(r)){
            root.right = null;
        }else{
            remove(r, set);
        }
    }

    public boolean dfs(TreeNode root, Set<TreeNode> set){
        if(root == null){
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right; 
        if(left == null && right == null){
            if(root.val == 0){
                set.add(root);
                return true;
            }else{
                return false;
            }
        }else{
          boolean lb = dfs(left, set);
          boolean rb = dfs(right, set);
          if(root.val == 0 && lb && rb){
            set.add(root);
            return true;
          }else{
            return false;
          }
        }
    }
}
// @lc code=end

