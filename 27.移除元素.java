/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int head = 0;
        int tail = nums.length - 1;
        while(head <= tail){
            if(nums[head] == val){
                nums[head] = nums[tail];
                tail = tail - 1;
            }else{
                head = head + 1;
            }
        }
        return head;
    }
}
// @lc code=end

