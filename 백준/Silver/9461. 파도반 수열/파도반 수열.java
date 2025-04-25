import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] dp = new long[101];
        dp[1] = dp[2] = dp[3] = 1;
        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(dp[N]);
        }
    }
}
