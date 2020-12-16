/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1){
            return x;
        }
        int l = 0;
        int r = x;
        while(l < r){
            int mid = l + (r - l) /2;
            if(mid > x / mid){
                r = mid;
            }else{
                l = mid + 1;
            }       
        }
        return l - 1;
    }
}
// @lc code=end

