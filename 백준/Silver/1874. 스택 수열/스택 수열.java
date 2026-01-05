import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int startNum = 1;
        Stack<Integer> stk = new Stack<>();
        boolean a = true;
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            while (startNum <= target) {
                stk.push(startNum);
                startNum++;
                sb.append("+\n");
            }
            if (!stk.isEmpty() && stk.peek() == target) {
                stk.pop();
                sb.append("-\n");
            } else {
                a = false;
            } 
        }
        if (a) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
