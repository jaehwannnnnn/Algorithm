import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 1;
            a = a % 10;

            for (int i = 0; i < b; i++) {
                result = (result * a) % 10;
            }
            if (result == 0) {
                result = 10;
            }
            System.out.println(result);
        }
    }
}