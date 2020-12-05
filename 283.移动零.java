/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        while(i < length){
            int num = nums[i];
            if(num != 0){
                i++;
            }else{
                break;
            }
        }
        int left = i;
        int right = i;
        while(right < length){
          int num = nums[i];
          if(num == 0){
            right++;
          }else{
            nums[left] = nums[i];
            nums[i] = 0;
            left++;  
            right++;
          }
          i++;
        }
    }
}
// @lc code=end

