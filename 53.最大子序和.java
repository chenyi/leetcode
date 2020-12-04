/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int length = nums.length;
        for(int i = 0; i < length; i++){
          int num = nums[i];
          sum = sum + num;
          if(sum < num){
            sum = num;
          }
          if(sum > max){
            max = sum;
          }
        }
        return max;
    }
}
// @lc code=end

