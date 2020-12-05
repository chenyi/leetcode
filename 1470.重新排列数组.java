/*
 * @lc app=leetcode.cn id=1470 lang=java
 *
 * [1470] 重新排列数组
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            temp[i] = nums[i];
        }
        for(int j = 0;  j < n; j++){
            int x = temp[j];
            int y = nums[n + j];
            nums[2*j] = x;
            nums[2*j +1] = y;
        }
        return nums;
    }
}
// @lc code=end

