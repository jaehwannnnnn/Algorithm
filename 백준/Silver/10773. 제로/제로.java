import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            if (num != 0) {
                stk.push(num);
            } else {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            }
        }
        int sum = 0;
        if (!stk.isEmpty()) {
            for (int i = 0; i < stk.size(); i++) {
                sum += stk.get(i);
            }
        }
        System.out.println(sum);
    }
}