/*
 * @lc app=leetcode.cn id=1361 lang=java
 *
 * [1361] 验证二叉树
 */

// @lc code=start
class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {

        //skeleton

        int[] id = new int[n];
        for(int i = 0; i < n; i++ ){
            id[i] = 0;
        }
        //todo generate indegree
        for(int i = 0; i < n; i++){
            int lc = leftChild[i];
            int rc = rightChild[i]; 
            if(lc > -1){
                id[lc] = id[lc] + 1;
            }
            if(rc > -1){
                id[rc] = id[rc] + 1;
            }
        }

        // find the possible root
        int root = id[0];
        for(int i = 0; i < n; i++){
            int d = id[i];
            if(d == 0){
                root = i;
                break;
            }
        }

        Set<Integer> seen = new HashSet<Integer>();
        // walk from the possbile root, through the whole graph
        boolean noCycle = dfs(root, seen, leftChild, rightChild);
        return noCycle && seen.size() == n ;
    }

    public boolean dfs(int root, Set<Integer> seen, int[] leftChild, int[] rightChild){
       seen.add(root);
       int l = leftChild[root];
       int r = rightChild[root]; 
       if(seen.contains(l) || seen.contains(r)){
        return false;
       }
       if(l == -1 && r == -1){
        return true;
       }else if(l != -1 && r != -1){
          seen.add(l);
          seen.add(r);
          return dfs(l, seen, leftChild, rightChild) && dfs(r, seen, leftChild, rightChild);
       }else if(l != -1){
          seen.add(l);
          return dfs(l, seen, leftChild, rightChild);
       }else{
           seen.add(r);
          return dfs(r, seen, leftChild, rightChild);
       }
    }
}
// @lc code=end

