/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
    public List<Integer> postorderTraversal(TreeNode root) {
    //    List<Integer> ans = new ArrayList<Integer>();
    //    postorderTraversalRecursive(root, ans); 
    //    return ans;
          return postorderTraversalIterative(root);
    }

    public void postorderTraversalRecursive(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }else{
            postorderTraversalRecursive(root.left, ans);
            postorderTraversalRecursive(root.right, ans);
            ans.add(root.val);
        }
    }

    public List<Integer> postorderTraversalIterative(TreeNode root){
        LinkedList<Integer> ans = new LinkedList<Integer>();
        if(root == null){
           return ans;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            ans.addFirst(pop.val);
            if(pop.left != null){
              stack.push(pop.left);
            }
            if(pop.right != null){
              stack.push(pop.right);
            }
        }
        return ans;
    }
}
// @lc code=end

