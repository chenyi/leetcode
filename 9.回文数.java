/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        List<Integer> c = new ArrayList<Integer>();
        int temp = x;
        while(temp > 0){
            c.add(temp % 10);
            temp = temp / 10;
        }
        int l = 0;
        int h = c.size() - 1;
        while(l < h){
            if(c.get(l) != c.get(h)){
               return false; 
            }
            l++;
            h--;
        }
        return true;
    }
}
// @lc code=end

