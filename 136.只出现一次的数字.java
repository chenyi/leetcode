/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer, Integer> num2Count = new HashMap<Integer, Integer>();
        // for(int i = 0; i< nums.length; i++){
        //     int n = nums[i];
        //     if(!num2Count.containsKey(n)){
        //         num2Count.put(n, 1);
        //     }else{
        //         num2Count.put(n, 2);
        //     }
        // }
        // for(Integer n: num2Count.keySet()){
        //     if(num2Count.get(n) == 1){
        //         return n;
        //     }
        // }
        // return -1;

        return Arrays.stream(nums).reduce((a,b) -> {
            return a ^ b;
        }).getAsInt();
    }
}
// @lc code=end

