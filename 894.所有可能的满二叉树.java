/*
 * @lc app=leetcode.cn id=894 lang=java
 *
 * [894] 所有可能的满二叉树
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
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if(N % 2 == 0){
            return ans; 
        }
        if(N == 1){
            TreeNode root = new TreeNode(0);
            ans.add(root);
            return ans;
        }

        for(int i = 1; i < N ; i = i + 2){
            List<TreeNode> l = allPossibleFBT(i);
            List<TreeNode> r = allPossibleFBT(N - i - 1);
            for(TreeNode ln: l){
                for(TreeNode rn: r){
                   TreeNode root = new TreeNode(0);
                   root.left = ln;
                   root.right = rn;
                   ans.add(root); 
                }
            }
        }
        return ans;
    
    }
}
// @lc code=end

