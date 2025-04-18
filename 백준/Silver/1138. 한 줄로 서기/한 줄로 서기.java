import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] tallerCounts = new int[N];
        for (int i = 0; i < N; i++) {
            tallerCounts[i] = sc.nextInt();
        }

        Integer[] line = new Integer[N];
        Arrays.fill(line, 0);

        List<Integer> result = new ArrayList<>();

        for (int i = N - 1; i >= 0; i--) {
            int height = i + 1;
            int count = tallerCounts[i];
            result.add(count, height);
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
