/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int depth = 0;
        dfs(root, ans, depth);

        for(int i = 0 ; i < ans.size(); i++){
            if(i % 2 == 1){
               List<Integer> layer = ans.get(i);
               Collections.reverse(layer);
            }
        }

        return ans;
    }

    public void dfs(TreeNode root,  List<List<Integer>> ans, int depth){
        if(root == null){
            return;
        }
        int rootVal = root.val;
        if(depth == ans.size()){
            ans.add(new ArrayList<Integer>());
        }
        ans.get(depth).add(rootVal);
        dfs(root.left, ans, depth + 1);
        dfs(root.right, ans, depth + 1);
    } 
}
// @lc code=end

