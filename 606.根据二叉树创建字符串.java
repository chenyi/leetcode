/*
 * @lc app=leetcode.cn id=606 lang=java
 *
 * [606] 根据二叉树创建字符串
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
    public String tree2str(TreeNode t) {
        if(t == null){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        sb.append(t.val);
        if(t.left != null || t.right != null){
          if(t.left != null){
              sb.append("(");
              sb.append(tree2str(t.left));
              sb.append(")");
            }else{
                sb.append("()");
            }

        if(t.right != null){
            sb.append("(");
            sb.append(tree2str(t.right));
            sb.append(")");
        }
    }
        return sb.toString();
    }
}
// @lc code=end

