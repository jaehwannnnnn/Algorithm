import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		char[][] board = new char[N][N];
		for(int i=0;i<board.length;i++){
			String[] arr = br.readLine().split(" ");
			for(int k=0;k<board.length;k++){
				board[i][k] = arr[k].charAt(0);
			}
		}
		int[][] answer = new int[N][N];
		for(int i=0;i<K;i++){
			String[] bomb= br.readLine().split(" ");
			int bombX = Integer.parseInt(bomb[0]) - 1;
			int bombY = Integer.parseInt(bomb[1]) - 1;
			int[] dx = {-1,0,0,0,1};
			int[] dy = {0,1,0,-1,0};
			for(int j=0;j<5;j++){
				int currentX = bombX + dx[j];
				int currentY = bombY + dy[j];
				if(currentX >=0 && currentX < N && currentY >=0 && currentY < N){
					if(board[currentX][currentY]=='0'){
						answer[currentX][currentY]++;
					}else if(board[currentX][currentY]=='@'){
						answer[currentX][currentY] += 2;
					}
				}
			}
		}
		int max = 0;
		for(int i=0;i<answer.length;i++){
			for(int k=0;k<answer.length;k++){
				if(answer[i][k] > max){
					max = answer[i][k];
				}
			}
		}
		System.out.println(max);
	}
}