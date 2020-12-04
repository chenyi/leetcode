/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if(length == 0){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for(int i = 0; i < length; i++){
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
// @lc code=end

