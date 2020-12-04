/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int index = length - 1;
        int acc = 1;
        while(index >= 0){
            int current = digits[index];
            int sum = current + acc;
            current = sum % 10;
            acc = sum / 10;
            digits[index] = current;
            index--;
        }
        if(acc > 0){
            int[] result = new int[length + 1];
            result[0] = acc;
            for(int i = 0; i < length; i++){
                result[i + 1] = digits[i];
            }
            return result;
        }else{
            return digits;
        }
    }
}
// @lc code=end

