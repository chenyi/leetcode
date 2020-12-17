/*
 * @lc app=leetcode.cn id=852 lang=java
 *
 * [852] 山脉数组的峰顶索引
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length;

        while(l <= r){
            int m = l + (r - l) / 2;
            int mn = arr[m];
            int ln = arr[m-1];
            int rn = arr[m+1];

            if(ln < mn && mn < rn){
               // left side
               l = m ; 
            }else if(mn < ln && mn > rn){
                r = m; 
            }else{
                return m;
            }
        }
        return l + 1;
    }
}
// @lc code=end

