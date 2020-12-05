/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int length = nums.length;
        int count = 1;
        for(int i = 1; i < length ; i++){
            int num = nums[i];
            if(count > 0){
              if(num == maj){
                  count++;
              }else{
                  count--;
              }
            }else{
              maj = num;
              count++;
            }
        }
        return maj;
    }
}
// @lc code=end

