import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < ingredient.length; i++) {
            stk.push(ingredient[i]);

            if (stk.size() >= 4) {
                int fourth = stk.get(stk.size() - 4);
                int third = stk.get(stk.size() - 3);
                int second = stk.get(stk.size() - 2);
                int first = stk.get(stk.size() - 1);
                if (fourth == 1 && third == 2 && second == 3 && first == 1) {
                    stk.pop();
                    stk.pop();
                    stk.pop();
                    stk.pop();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
