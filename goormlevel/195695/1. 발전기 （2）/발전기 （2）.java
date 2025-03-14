import java.io.*;
import java.util.*;
class Main {
	static int N;
	static int K;
	static int[][] board;
	static boolean[][] visited;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		board = new int[N][N];
		visited = new boolean[N][N];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<N;i++){
			String[] sarr = br.readLine().split(" ");
			for(int j=0;j<N;j++){
				board[i][j] = Integer.parseInt(sarr[j]);
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(!visited[i][j]){
					if(DFS(i,j)){
						map.put(board[i][j], map.getOrDefault(board[i][j], 0) + 1);
					}
				}
			}
		}
		int maxKey = 0;
		int maxValue = 0;
		List<Integer> keys = new ArrayList<>(map.keySet());
		for(int i=0;i<keys.size();i++){
			int key = keys.get(i);
			int value = map.get(key);
			if(value > maxValue || (value == maxValue && key > maxKey)){
				maxValue = value;
				maxKey = key;
			}
		}
		System.out.println(maxKey);
	}
	public static Boolean DFS(int x, int y){
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		int count = 1;
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
				if(nx>=0 && nx<N && ny>=0 && ny<N && board[nx][ny]==board[x][y] && !visited[nx][ny]){
					visited[nx][ny] = true;
					stk.push(new int[] {nx,ny});
					count++;
				}
			}
		}
		if(count >= K){
			return true;
		}
		return false;
	}
}