/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int l = 1;
       int r = n;
       int ans = l + (r  - l) / 2;
       int guess = guess(ans);
       while(guess != 0){
        
         if(guess > 0){
            // pick > ans
            l = ans + 1;
         }else{
           // pick < ans
           r = ans - 1;
         }
         ans = l + (r  - l) / 2;
         guess = guess(ans);
       } 
       return ans;
    }
}
// @lc code=end

