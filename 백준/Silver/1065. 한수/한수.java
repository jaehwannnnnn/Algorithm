import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (isHansu(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
    public static boolean isHansu(int number) {
        if (number < 100) {
            return true;
        }
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        return (hundreds - tens) == (tens - ones);
    }
}
