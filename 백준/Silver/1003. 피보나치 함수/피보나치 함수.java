import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] countZero = new int[41];
        int[] countOne = new int[41];
        countZero[0] = 1;
        countOne[0] = 0;
        countZero[1] = 0;
        countOne[1] = 1;
        for (int i = 2; i <= 40; i++) {
            countZero[i] = countZero[i - 1] + countZero[i - 2];
            countOne[i] = countOne[i - 1] + countOne[i - 2];
        }
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(countZero[N] + " " + countOne[N]);
        }
    }
}
