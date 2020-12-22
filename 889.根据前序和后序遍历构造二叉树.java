/*
 * @lc app=leetcode.cn id=889 lang=java
 *
 * [889] 根据前序和后序遍历构造二叉树
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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int prel = 0;
        int prer = pre.length - 1;
        int postl = 0;
        int postr = post.length -1; 
        return constructFromPrePost(pre, post, prel, prer, postl, postr);
    }

    public TreeNode constructFromPrePost(int[] pre, int[] post, int prel, int prer, int postl, int postr) {
        if(prel > prer || postl > postr){
            return null;
        }
        int rootVal = pre[prel];
        TreeNode root = new TreeNode(rootVal);
        if(postl == postr){
            return root;
        }

        int leftRootValue = pre[prel + 1];

        int p = postl;
        while(p <= postr){
            if(post[p] == leftRootValue){
                break;
            }
            p++;
        }
        int leftLength = p - postl + 1;



        root.left = constructFromPrePost(pre, post, prel + 1, prel + leftLength, postl, p); //todo
        root.right = constructFromPrePost(pre, post, prel + leftLength + 1, prer, p+1, postr - 1); //todo
        return root;
    }
}
// @lc code=end

