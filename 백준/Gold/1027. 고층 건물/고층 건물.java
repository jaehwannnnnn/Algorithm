import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            int visibleCount = 0;

            for (int j = i - 1; j >= 0; j--) {
                boolean isVisible = true;
                double slope = (double) (heights[i] - heights[j]) / (i - j);
                for (int k = j + 1; k < i; k++) {
                    double expectedHeight = heights[j] + slope * (k - j);
                    if (heights[k] >= expectedHeight) {
                        isVisible = false;
                        break;
                    }
                }
                if (isVisible) {
                    visibleCount++;
                }
            }
            for (int j = i + 1; j < N; j++) {
                boolean isVisible = true;
                double slope = (double) (heights[j] - heights[i]) / (j - i);
                for (int k = i + 1; k < j; k++) {
                    double expectedHeight = heights[i] + slope * (k - i);
                    if (heights[k] >= expectedHeight) {
                        isVisible = false;
                        break;
                    }
                }
                if (isVisible) {
                    visibleCount++;
                }
            }
            max = Math.max(max, visibleCount);
        }
        System.out.println(max);
    }
}
