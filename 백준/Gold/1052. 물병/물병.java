import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int bought = 0;

        while (Integer.bitCount(N) > K) {
            N++;
            bought++;
        }
        System.out.println(bought);
    }
}
