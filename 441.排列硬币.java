/*
 * @lc app=leetcode.cn id=441 lang=java
 *
 * [441] 排列硬币
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        // int i = 0;
        // int sum = 0;
        // while((n - sum) >= i){
        //     sum = sum + i;
        //     if(sum == n){
        //         return i;
        //     }
        //     i = i + 1;
        // }
        // return i - 1;

        int l = 0;
        int r = n;
        if(n <= 1){
            return n;
        }
        while(l < r){
            int m = l + (r - l)/ 2;
            long sum = (long)m * (long)(m + 1) /2;
            if(sum == n ){
                return m;
            }else if(sum < n){
                l = m + 1;
            }else{
                r = m;
            }
        }
        return l - 1;
    }
}
// @lc code=end

