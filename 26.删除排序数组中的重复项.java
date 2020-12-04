/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int p = 0;
        int p1 = 0;
        int p2 = 0;
        while(p2 < length){
            int current1 = nums[p1];
            int current2 = nums[p2];
            if(current1 == current2){
                p2++;
                nums[p] = current1;
                continue;
            }else{
                p = p + 1;
                p1 = p2;
            }
        }
        return p + 1 ;
    }
}
// @lc code=end

