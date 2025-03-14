import java.io.*;
import java.util.*;

class Main {
	static int N;
	static int[][] board;
	static boolean[][] visited;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		visited = new boolean[N][N];
		for(int i=0;i<N;i++){
			String[] sarr = br.readLine().split(" ");
			for(int k=0;k<N;k++){
				board[i][k] = Integer.parseInt(sarr[k]);
			}
		}
		int answer = 0;
		for(int i =0;i<N;i++){
			for(int j=0;j<N;j++){
				if(board[i][j] == 1 && !visited[i][j]){
					DFS(i,j);
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
	public static void DFS(int x, int y){
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		Stack<int[]> stk = new Stack<>();
		stk.push(new int[]{x,y});
		visited[x][y] = true;
		while(!stk.isEmpty()){
			int[] current = stk.pop();
			int cx = current[0];
			int cy = current[1];
			for(int i=0;i<4;i++){
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if(nx>=0 && nx<N && ny>=0 && ny<N && board[nx][ny]==1 && !visited[nx][ny]){
					visited[nx][ny] = true;
					stk.push(new int[] {nx,ny});
				}
			}
		}
	}
}