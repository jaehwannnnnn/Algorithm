import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int Q = Integer.parseInt(input[2]);

        char[][] board = new char[N][N];
        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                board[i][j] = arr[j];
            }
        }

				int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
			
        for (int q = 0; q < Q; q++) {
            String[] query = br.readLine().split(" ");
						int x = Integer.parseInt(query[0]) - 1;
						int y = Integer.parseInt(query[1]) - 1;
						char c = query[2].charAt(0);
						board[x][y] = c;
            boolean[][] visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && board[i][j] != '.') {
                        List<int[]> list = new ArrayList<>();
                        Stack<int[]> stk = new Stack<>();
                        stk.push(new int[]{i, j});
                        visited[i][j] = true;
                        while (!stk.isEmpty()) {
                            int[] current = stk.pop();
                            list.add(current);
                            for (int k = 0; k < 4; k++) {
                                int nx = current[0] + dx[k];
                                int ny = current[1] + dy[k];
                                if (nx >= 0 && nx < N && ny >= 0 && ny < N
                                        && !visited[nx][ny] && board[nx][ny] == board[i][j]) {
                                    stk.push(new int[]{nx, ny});
                                    visited[nx][ny] = true;
                                }
                            }
                        }
                        if (list.size() >= K) {
                            for (int l = 0; l < list.size(); l++) {
                                int[] iarr = list.get(l);
                                board[iarr[0]][iarr[1]] = '.';
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(board[i]);
        }
    }
}