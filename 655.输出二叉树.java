/*
 * @lc app=leetcode.cn id=655 lang=java
 *
 * [655] 输出二叉树
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
    public List<List<String>> printTree(TreeNode root) {
        int height = getHeight(root);
        int width = (1 << height) - 1;
        List<List<String>> ans = new ArrayList<List<String>>();

        for(int i = 0; i < height; i++){
            List<String> row = new ArrayList<String>();
            ans.add(row);
            for(int j = 0; j < width; j++){
                row.add("");
            }

        }

        printTree(root, 0, ans, 0, width - 1);
        return ans;
    }

    public void printTree(TreeNode root, int level, List<List<String>> ans, int left, int right){
        if(root == null){
            return;
        }
        List<String> row = ans.get(level);
        int mid = (left + right) / 2;
        row.set(mid, String.valueOf(root.val));
        printTree(root.left, level + 1, ans, left, mid - 1);
        printTree(root.right, level + 1, ans, mid + 1, right);
    }

    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
// @lc code=end

