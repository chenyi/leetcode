/*
 * @lc app=leetcode.cn id=448 lang=java
 *
 * [448] 找到所有数组中消失的数字
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        for(int i = 0; i < length; i++){
          int num = Math.abs(nums[i]);
          nums[num -1] = -Math.abs(nums[num - 1]);
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < length; i++){
            int num = nums[i];
            if(num > 0){
              result.add( i + 1);
            }
        }
        return result;
    }
}
// @lc code=end

