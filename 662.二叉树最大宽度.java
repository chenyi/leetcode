/*
 * @lc app=leetcode.cn id=662 lang=java
 *
 * [662] 二叉树最大宽度
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
    int width = 0;
    public int widthOfBinaryTree(TreeNode root) {
       List<List<Integer>> layers = new ArrayList<List<Integer>>(); 
       Map<TreeNode, Integer> node2Order = new HashMap<TreeNode, Integer>();
        
       if(root == null){
        return width;
       }

       List<Integer> layer = new ArrayList<Integer>();
       layer.add(1);
       layers.add(layer);
       node2Order.put(root, 1);
       int depth = 1;
       dfs(root, layers, depth, node2Order); 
       

       for(List<Integer> l: layers){
           if(l.size() > 0){

             width = Math.max(width, l.get(l.size() -1) - l.get(0) + 1);
           }
           System.out.println(l);
       }

       return width;
    }

    public void dfs(TreeNode root, List<List<Integer>> layers, int depth, Map<TreeNode, Integer> node2Order){

        if(root == null){
            return;
        }

        if(depth == layers.size()){
            List<Integer> list = new ArrayList<Integer>();
            layers.add(list);
        }
        List<Integer>  layer =  layers.get(depth);

        Integer rootOrder = node2Order.get(root); 
        int leftOrder = rootOrder * 2 - 1;
        int rightOrder = rootOrder * 2;
        TreeNode l = root.left;
        if(l != null){
            layer.add(leftOrder);
            node2Order.put(l, leftOrder);
            dfs(l, layers, depth +1, node2Order);
        }

        TreeNode r = root.right;
        if(r != null){
          layer.add(rightOrder);
          node2Order.put(r, rightOrder);
          dfs(r, layers, depth +1, node2Order);
        }
    }


}
// @lc code=end

