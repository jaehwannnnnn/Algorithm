import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            Stack<Character> stk = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!stk.isEmpty() && stk.peek() == c) {
                    stk.pop();
                } else {
                    stk.push(c);
                } 
            }
            if (stk.isEmpty()) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
