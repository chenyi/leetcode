/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;


        while(l <= r){
            int m = l + (r - l) / 2;
            if( m == num / m ){
                if( num % m == 0){
                  return true;
                }else{
                  l = m + 1;
                }
            }else if(m > num / m){
                r = m - 1;
            }else{
                l = m + 1;
            }
        }

        return false;
    }
}
// @lc code=end

