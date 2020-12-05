/*
 * @lc app=leetcode.cn id=1512 lang=java
 *
 * [1512] 好数对的数目
 */

// @lc code=start
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> num2Count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = 0;
            if(num2Count.containsKey(num)){
                count = num2Count.get(num);
            }
            num2Count.put(num, count + 1);
        }
        int sum = 0;
        for(Integer num: num2Count.keySet()){
          int count = num2Count.get(num);
          sum = sum + count * (count - 1) / 2; 
        }
        return sum;
    }
}
// @lc code=end

