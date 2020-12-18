/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {

        List<Integer> q = new ArrayList<Integer>();
        if(x == Integer.MIN_VALUE){
            return 0;
        }

        //seperate the digits
        int temp = Math.abs(x);
        while(temp >= 10){
            Integer d = temp % 10;
            q.add(d);
            temp = temp / 10;
        }
        q.add(temp);

        // generate the number
        int sum = 0;
        for(Integer d : q){
            if(sum * 10 / 10 != sum){
                return 0;
            }
            sum = sum * 10 + d;
        }
        
        if(x < 0){
            return 0 - sum;
        }

        return sum;
    }
}
// @lc code=end

