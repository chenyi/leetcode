/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        int length = nums.length;
        for(int i = 0; i < length; i++){
          int num = nums[i];
          pre = Math.max(pre + num, num);
          max = Math.max(pre, max);
        }
        return max;
    }
}
// @lc code=end

