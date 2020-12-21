/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>(); 
        int depth = 0;
        levelOrderBottom(root, ans, 0);
        Collections.reverse(ans);
        return ans;
    }

    public void levelOrderBottom(TreeNode root, List<List<Integer>> ans, int depth) {
        if(root == null){
            return;
        }else{
            if(ans.size() ==  depth){
               ans.add(new ArrayList<Integer>());
            }
            List<Integer> row = ans.get(depth);
            row.add(root.val);
            levelOrderBottom(root.left, ans, depth+1);
            levelOrderBottom(root.right, ans, depth + 1);
        }
    }
}
// @lc code=end

