import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        if(check(s)){
            answer++;
        }
        for(int i=1;i<s.length();i++){
            str = s.substring(i, s.length()) + s.substring(0, i);
            if(check(str)){
                answer++;
            }
        }
        return answer;
    }
    public boolean check(String s){
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty()){
                if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']'){
                    return false;
                }else{
                    stk.push(s.charAt(i));
                }
            }else{
                if(stk.peek() == '(' && s.charAt(i) == ')'){
                    stk.pop();
                }else if(stk.peek() == '{' && s.charAt(i) == '}'){
                    stk.pop();
                }else if(stk.peek() == '[' && s.charAt(i) == ']'){
                    stk.pop();
                }else if(s.charAt(i) == '(' ||s.charAt(i) == '[' || s.charAt(i) == '{'){
                    stk.push(s.charAt(i));
                }else{
                    return false;
                }
            }
        }
        if(stk.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}