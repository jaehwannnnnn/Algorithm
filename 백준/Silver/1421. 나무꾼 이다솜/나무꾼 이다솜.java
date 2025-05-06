import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int W = sc.nextInt();
        int[] trees = new int[N];
        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
            maxLen = Math.max(maxLen, trees[i]);
        }
        long maxProfit = 0;
        for (int len = 1; len <= maxLen; len++) {
            long totalProfit = 0;
            for (int tree : trees) {
                if (tree < len) continue;
                int pieces = tree / len;
                int cuts = tree % len == 0 ? pieces - 1 : pieces;
                long profit = (long) pieces * len * W - (long) cuts * C;
                if (profit > 0) totalProfit += profit;
            }
            maxProfit = Math.max(maxProfit, totalProfit);
        }
        System.out.println(maxProfit);
    }
}
