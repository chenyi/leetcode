/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<String>();
        if(root == null){
            return ans;
        }
        if(root.left == null && root.right == null){
            ans.add(String.valueOf(root.val));
            return ans;
        }

        

        if(root.left != null){
            String text = String.valueOf(root.val);
            List<String> leftString = binaryTreePaths(root.left);
            for(String sub: leftString){
                ans.add(text + "->" + sub);
            }
        }

        if(root.right != null){
            String text = String.valueOf(root.val);
            List<String> rightString = binaryTreePaths(root.right);
            for(String sub: rightString){
                ans.add(text + "->" + sub);
            }
        }
        return ans;

    }
}
// @lc code=end

