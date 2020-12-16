/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> n2Index = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++){
            int n = numbers[i];
            if(n2Index.containsKey(n)){
                return new int[]{n2Index.get(n) + 1, i + 1};
            }else{
                n2Index.put(target - n, i);
            }
        }
        return new int[]{0, 0};
    }
}
// @lc code=end

