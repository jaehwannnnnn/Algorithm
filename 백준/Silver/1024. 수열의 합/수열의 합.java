import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        for (int k = L; k <= 100; k++) {
            int numerator = 2 * N - k * (k - 1);
            if (numerator < 0) continue;
            if (numerator % (2 * k) != 0) continue;
            int x = numerator / (2 * k);
            for (int i = 0; i < k; i++) {
                System.out.print((x + i) + " ");
            }
            return;
        }
        System.out.println(-1);
    }
}
