/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
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

    TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       Map<Integer, TreeNode> map = new HashMap<Integer, TreeNode>(); 
       dfs(root, map);

        TreeNode pp = p;
        Set<TreeNode> paths = new HashSet<TreeNode>();
        while(pp != null){
           paths.add(pp);
           pp = map.get(pp.val);
        }

        TreeNode qp = q;
        while(qp != null){
            if(paths.contains(qp)){
                break;
            }
            qp = map.get(qp.val);
        }
        return qp;

    }

    public void dfs(TreeNode root, Map<Integer, TreeNode> map){
        if(root == null){
            return;
        }
        TreeNode l = root.left;
        TreeNode r = root.right;

        if(l != null){
            map.put(l.val, root);
        }
        if(r != null){
            map.put(r.val, root);
        }
        dfs(root.left, map);
        dfs(root.right, map);

    }

}
// @lc code=end

