import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }
        int maxSize = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int d = 1; i + d < N && j + d < M; d++) {
                    int a = map[i][j];
                    int b = map[i][j + d];
                    int c = map[i + d][j];
                    int dCorner = map[i + d][j + d];
                    if (a == b && a == c && a == dCorner) {
                        int squareSize = (d + 1) * (d + 1);
                        maxSize = Math.max(maxSize, squareSize);
                    }
                }
            }
        }
        System.out.println(maxSize);
    }
}
