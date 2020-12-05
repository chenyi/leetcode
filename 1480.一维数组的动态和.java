/*
 * @lc app=leetcode.cn id=1480 lang=java
 *
 * [1480] 一维数组的动态和
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
// @lc code=end

