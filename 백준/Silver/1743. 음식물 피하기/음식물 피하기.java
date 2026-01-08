import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K;
    static boolean[][] visited;
    static boolean[][] trash;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int bfs(int sr, int sc) {
        Queue<int[]> q = new ArrayDeque<>();
        visited[sr][sc] = true;
        q.offer(new int[]{sr, sc});
        int count = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int a = cur[0];
            int b = cur[1];
            for (int d = 0; d < 4; d++) {
                int nr = a + dx[d];
                int nc = b + dy[d];
                if (nr < 1 || nr > N || nc < 1 || nc > M) {
                    continue;
                }
                if (visited[nr][nc]){
                    continue;
                }
                if (!trash[nr][nc]) {
                    continue;
                }
                visited[nr][nc] = true;
                q.offer(new int[]{nr, nc});
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        trash = new boolean[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            trash[r][c] = true;
        }
        int answer = 0;
        for (int r = 1; r <= N; r++) {
            for (int c = 1; c <= M; c++) {
                if (trash[r][c] && !visited[r][c]) {
                    answer = Math.max(answer, bfs(r, c));
                }
            }
        }
        System.out.println(answer);
    }
}
