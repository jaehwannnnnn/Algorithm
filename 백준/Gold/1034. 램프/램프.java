import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> rowPatternMap = new HashMap<>();
        List<String> rows = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String row = sc.nextLine();
            rows.add(row);
            rowPatternMap.put(row, rowPatternMap.getOrDefault(row, 0) + 1);
        }
        int K = sc.nextInt();
        sc.close();

        int maxLitRows = 0;

        for (String row : rows) {
            int zeroCount = 0;
            for (char c : row.toCharArray()) {
                if (c == '0') zeroCount++;
            }
            if (zeroCount <= K && (K - zeroCount) % 2 == 0) {
                maxLitRows = Math.max(maxLitRows, rowPatternMap.get(row));
            }
        }

        System.out.println(maxLitRows);
    }
}
