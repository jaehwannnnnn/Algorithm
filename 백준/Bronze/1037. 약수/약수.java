import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] divisors = new int[count];
        for (int i = 0; i < count; i++) {
            divisors[i] = sc.nextInt();
        }
        int min = Arrays.stream(divisors).min().getAsInt();
        int max = Arrays.stream(divisors).max().getAsInt();
        System.out.println(min * max);
    }
}
