/*
 * @lc app=leetcode.cn id=637 lang=java
 *
 * [637] 二叉树的层平均值
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> temp = levelOrder(root);
        List<Double> ans = new ArrayList<Double>(); 
        for(List<Integer> level: temp){
            double sum = 0;
            for(Integer val: level){
                sum += val;
            }
            ans.add((sum * 1.0)/ level.size());
        } 
        return ans;
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        return BFSIterative(root);
        // return DFSRecursive(root);
    }

    
    public List<List<Integer>> BFSIterative(TreeNode root){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root != null){
            List<TreeNode> curr = new ArrayList<TreeNode>();
            curr.add(root);
            while(!curr.isEmpty()){
                List<TreeNode> next = new ArrayList<TreeNode>();
                List<Integer> level = new ArrayList<Integer>();
                ans.add(level);
                for(TreeNode node : curr){
                    int val = node.val;
                    level.add(val);
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

    public List<List<Integer>> DFSRecursive(TreeNode root){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root != null){
           DFSRecursive(root, 0, ans);
        }
        return ans;
    }

    public void DFSRecursive(TreeNode root, int depth, List<List<Integer>> ans){
        if(root == null){
            return;
        }

        if(ans.size() <= depth){
            ans.add(new ArrayList<Integer>());
        }
        int val = root.val;
        ans.get(depth).add(val);
        TreeNode left =  root.left;
        TreeNode right = root.right;
        DFSRecursive(left, depth + 1, ans);
        DFSRecursive(right, depth + 1, ans);
    }
}
// @lc code=end

