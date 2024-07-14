import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stk = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (!stk.isEmpty() && stk.peek() == currentChar) {
                stk.pop();
            } else {
                stk.push(currentChar);
            }
        }
        return stk.isEmpty() ? 1 : 0; 
    }
}

