import java.util.*;

public class Main {
    static int N, M;
    static int[][] maze;
    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        maze = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = scanner.next();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0, 0));
    }
    static int bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        int[][] distance = new int[N][M];
        distance[startX][startY] = 1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (isValid(newX, newY) && maze[newX][newY] == 1 && distance[newX][newY] == 0) {
                    distance[newX][newY] = distance[x][y] + 1;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }
        return distance[N - 1][M - 1];
    }
    static boolean isValid(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}
