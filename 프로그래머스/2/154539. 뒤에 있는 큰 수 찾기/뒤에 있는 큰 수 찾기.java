import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int current = numbers[i];
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }
            answer[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(current);
        }
        return answer;
    }
}
