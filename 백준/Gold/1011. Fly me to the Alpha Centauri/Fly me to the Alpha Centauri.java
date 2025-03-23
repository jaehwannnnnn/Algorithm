import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            long distance = y - x;
            long n = (long)Math.sqrt(distance);
            if (n * n == distance) {
                System.out.println(2 * n - 1);
            } else if (distance <= n * n + n) {
                System.out.println(2 * n);
            } else {
                System.out.println(2 * n + 1);
            }
        }
    }
}