/*
 * @lc app=leetcode.cn id=1217 lang=java
 *
 * [1217] 玩筹码
 */

// @lc code=start
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenSize = 0;
        int oddSize = 0;
        int length = position.length;
        for(int i = 0; i < length; i++){
            int pos = position[i];
            if(pos % 2 == 0){
                evenSize++; 
            }else{
                oddSize++;
            }
        }
        if(oddSize < evenSize){
            return oddSize;
        }else{
            return evenSize;
        }
    }
}
// @lc code=end

