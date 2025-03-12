import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] board = new String[N][N];
        String[] sarr1 = br.readLine().split(" ");
        String[] sarr2 = br.readLine().split(" ");
        int[] goormIdx = {Integer.parseInt(sarr1[0]) - 1, Integer.parseInt(sarr1[1]) - 1};
        int[] playerIdx = {Integer.parseInt(sarr2[0]) - 1, Integer.parseInt(sarr2[1]) - 1};
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().split(" ");
        }
        int goormScore = getScore(N, board, goormIdx);
        int playerScore = getScore(N, board, playerIdx);
        if (goormScore> playerScore) {
            System.out.println("goorm " + goormScore);
        } else {
            System.out.println("player " + playerScore);
        }
    }
    public static int getScore(int N, String[][] board, int[] position) {
        boolean[][] visited = new boolean[N][N];
        int score = 1;
				visited[position[0]][position[1]] = true;
        while (true) {
						String command = board[position[0]][position[1]];
            int step = Integer.parseInt(command.replaceAll("[^0-9]", ""));
            char direction = command.replaceAll("[^UDLR]", "").charAt(0);            
						for(int i=0;i<step;i++){
							switch (direction) {
									case 'L': position[1] = (position[1] - 1 + N) % N; break; 
									case 'R': position[1] = (position[1] + 1) % N; break; 
									case 'U': position[0] = (position[0] - 1 + N) % N; break; 
									case 'D': position[0] = (position[0] + 1) % N; break; 
							}
							if(visited[position[0]][position[1]]){
								return score;
							}
							visited[position[0]][position[1]] = true;
              score++;
						}
				}
    }
}
