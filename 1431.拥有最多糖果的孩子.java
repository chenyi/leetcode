/*
 * @lc app=leetcode.cn id=1431 lang=java
 *
 * [1431] 拥有最多糖果的孩子
 */

// @lc code=start
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        List<Boolean> list = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++){
            int couldBe = candies[i] + extraCandies;
            if(couldBe >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }        
        return list;
    }
}
// @lc code=end

