/*
 * @lc app=leetcode.cn id=1457 lang=java
 *
 * [1457] 二叉树中的伪回文路径
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
    int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
       Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
       dfs(root, counter); 
       return count;
    }

    public void dfs(TreeNode root, Map<Integer, Integer> counter){
        if(root == null){
            return;
        }
        int val = root.val;
        if(counter.get(val) == null){
            counter.put(val, 0);
        }
        counter.put(val, counter.get(val) + 1);

        TreeNode l = root.left;
        TreeNode r = root.right;
        if(l == null && r == null){
            int oddCount = 0;
            for(Integer key: counter.keySet()){
                if(counter.get(key) % 2 == 1){
                    oddCount++;
                }
            }
            if(oddCount <= 1){
              count++;
            }
        }

        if(l != null){
          Map<Integer, Integer> counter1 = new HashMap<Integer, Integer>(counter);
          dfs(root.left, counter1);
        }
        if(r != null){
          Map<Integer, Integer> counter2 = new HashMap<Integer, Integer>(counter);
          dfs(root.right, counter2);
        }
    }
}
// @lc code=end

