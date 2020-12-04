/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int head = 0;
        int length = nums.length;
        int tail = length - 1;
        int mid = 0;
        while(head <= tail){
            mid = (head + tail) /2;
            int midNum = nums[mid];
            if(midNum == target){
                return mid;
            }else if(midNum < target){
                head = mid + 1;
            }else{
                tail = mid - 1;
            }
        }
        return head;
    }
}
// @lc code=end

