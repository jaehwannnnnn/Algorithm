import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] tip = new int[N];
        for (int i = 0; i < N; i++) {
            tip[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(tip);
        long sum = 0;
        int idx = 0;
        for (int i = N - 1; i >= 0; i--) {
            int x = tip[i] - idx;
            if (x <= 0) {
                break;
            }
            sum += x;
            idx++;
        }
        System.out.println(sum);
    }
}
