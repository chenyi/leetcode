/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(int i = 0; i < charArray.length; i++){
            Character current = charArray[i];
            if(map.containsValue(current)){
                stack.add(current);
            }else if(map.containsKey(current)){
                if(stack.isEmpty()){
                    return false;
                }
                Character top = stack.pop();
                Character value = map.get(current);
                if(!top.equals(value)){
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
// @lc code=end

