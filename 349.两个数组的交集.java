/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            s1.add(nums1[i]);
        }
        Set<Integer> result = new HashSet<Integer>(); 
        for(int j = 0; j < nums2.length; j++){
           if(s1.contains(nums2[j])){
             result.add(nums2[j]);
           } 
        }

        return result.stream().mapToInt(i -> i).toArray();
        
    }
}
// @lc code=end

