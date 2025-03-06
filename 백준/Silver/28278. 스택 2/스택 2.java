import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            switch (num) {
                case 1:
                    int a = Integer.parseInt(st.nextToken());
                    stk.push(a);
                    break;
                case 2:
                    if (!stk.isEmpty()) {
                        System.out.println(stk.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    System.out.println(stk.size());
                    break;
                case 4:
                    if (!stk.isEmpty()) {
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                    break;
                case 5:
                    if (!stk.isEmpty()) {
                        System.out.println(stk.peek());
                    } else {
                        System.out.println(-1);
                    }
            }
        }
    }
}