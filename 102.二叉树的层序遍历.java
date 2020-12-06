/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        return BFS(root);
        // return DFS(root);
    }

    /**
     * iterative
     */
    public List<List<Integer>> BFS(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root != null){
            List<TreeNode> curr = new ArrayList<TreeNode>();
            curr.add(root);
            while(!curr.isEmpty()){
                List<Integer> level = new ArrayList<Integer>();
                ans.add(level);

                List<TreeNode> next = new ArrayList<TreeNode>();
                for(TreeNode node: curr){
                  level.add(node.val);
                  TreeNode left = node.left;
                  TreeNode right = node.right;
                  if(left != null){
                    next.add(left);
                  }
                  if(right != null){
                    next.add(right);
                  }
                }
                curr = next;
            }
        }
        return ans;
    }

    /**
     * recursive
     */
    public List<List<Integer>> DFS(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root != null){
          DFS(root, 0, ans);
        }
        return ans;
    }

    public void DFS(TreeNode root, int depth, List<List<Integer>> ans){
        if(ans.size() <= depth){
            ans.add(new ArrayList<Integer>());
        }
        ans.get(depth).add(root.val);
        TreeNode left = root.left;
        TreeNode right = root.right;
        if(left != null){
            DFS(left, depth + 1, ans);
        }
        if(right != null){
            DFS(right, depth + 1, ans);
        }
    }
    
}
// @lc code=end

