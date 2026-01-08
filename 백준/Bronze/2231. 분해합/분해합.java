import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = Math.max(1, N - 54); i < N; i++) {
            int sum = i;
            int x = i;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
