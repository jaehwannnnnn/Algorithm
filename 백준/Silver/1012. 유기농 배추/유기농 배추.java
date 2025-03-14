import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int T;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[][] board = new int[M][N];
            boolean[][] visited = new boolean[M][N];
            int K = sc.nextInt();
            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                board[x][y] = 1;
            }
            sc.nextLine();
            int answer = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (board[i][j] == 1 && !visited[i][j]) {
                        DFS(i, j, board, visited);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
    public static void DFS(int x, int y,int[][] board, boolean[][] visited) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, y});
        visited[x][y] = true;
        while (!stk.isEmpty()) {
            int[] current = stk.pop();
            int cx = current[0];
            int cy = current[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    stk.push(new int[]{nx, ny});
                }
            }
        }
    }
}
