import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int minEightCount = Integer.MAX_VALUE;
        for (int i = L; i <= R; i++) {
            int count = 0, num = i;
            while (num > 0) {
                if (num % 10 == 8) {
                    count++;
                }
                num /= 10;
            }
            minEightCount = Math.min(minEightCount, count);
            if (minEightCount == 0) {
                break;
            }
        }
        System.out.println(minEightCount);
    }
}