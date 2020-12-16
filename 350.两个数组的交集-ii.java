/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counter1  = new HashMap<Integer, Integer>();
        if(nums1 != null && nums1.length > 0){
          for(int i = 0; i < nums1.length; i++){
              int count = 1;
              if(counter1.containsKey(nums1[i])){
                  count += counter1.get(nums1[i]);
              }
              counter1.put(nums1[i], count);
          }
        }
        Map<Integer, Integer> counter2  = new HashMap<Integer, Integer>();

        if(nums2 != null && nums2.length > 0){

          for(int j = 0; j < nums2.length; j++){
              int count = 1;
              if(counter2.containsKey(nums2[j])){
                  count += counter2.get(nums2[j]);
              }
              counter2.put(nums2[j], count);
          }
        }

        Map<Integer, Integer> counter3  = new HashMap<Integer, Integer>();
        for(Integer num: counter1.keySet()){
            if(counter2.containsKey(num)){
                counter3.put(num, Math.min(counter1.get(num), counter2.get(num)));
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        for(Integer num: counter3.keySet()){
            int count = counter3.get(num);
            for(int k = 0; k < count; k ++){
                result.add(num);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
// @lc code=end

