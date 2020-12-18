/*
 * @lc app=leetcode.cn id=744 lang=java
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;
        if(letters[r] <= target){
            return letters[0];
        }
        while(l < r){
            int m = l + (r - l) / 2;
            int letter = letters[m];
            if(letter == target){
                l = l + 1;
            }else if(letter < target){
                l = m + 1;
            }else{
                r = m;
            }
        }
        return letters[r];
    }
}
// @lc code=end

