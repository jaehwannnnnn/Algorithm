import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Long> numbers = new ArrayList<>();

        for (long i = 0; i <= 9; i++) {
            makeNumbers(i, numbers);
        }
        Set<Long> nums = new HashSet<>(numbers);
        long[] results = nums.stream().mapToLong(x -> x).toArray();
        Arrays.sort(results);
        if (N >= results.length) {
            System.out.println(-1);
        } else {
            System.out.println(results[N]);
        }
    }

    public static void makeNumbers(long num, List<Long> list) {
        list.add(num);
        long lastDigit = num % 10;
        for (long i = 0; i < lastDigit; i++) {
            long newNum = num * 10 + i;
            makeNumbers(newNum, list);
        }
    }
}
