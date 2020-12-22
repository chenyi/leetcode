/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int depth = 0;
        dfs(root, ans, depth);

        List<Integer> ans2 = new ArrayList<Integer>();
        for(List<Integer> layer: ans){
            ans2.add(layer.get(layer.size() -1));
        }

        return ans2;//todo
    }

    public void dfs(TreeNode root, List<List<Integer>> ans, int depth ){
        if(root == null){
            return;
        }
        if(depth == ans.size()){
            ans.add(new ArrayList<Integer>());
        }
        ans.get(depth).add(root.val);

        dfs(root.left, ans, depth + 1);
        dfs(root.right, ans, depth + 1);
    }
}
// @lc code=end

