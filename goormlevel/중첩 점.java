import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		long[][][] dp = new long[2][N+1][N+1];
		long count = 0;
		for(int m=0;m<M;m++){
			String[] arr = br.readLine().split(" ");
			int y = Integer.parseInt(arr[0]);
			int x = Integer.parseInt(arr[1]);
			String dir = arr[2];
			if(dir.equals("D")){
				for(int i=y;i<=N;i++){
					count += dp[1][i][x];
					dp[0][i][x]++;
				}
			}else if(dir.equals("U")){
				for(int i=y;i>=1;i--){
					count += dp[1][i][x];
					dp[0][i][x]++;
				}
			}else if(dir.equals("R")){
				for(int i=x;i<=N;i++){
					count += dp[0][y][i];
					dp[1][y][i]++;
				}
			}else{
				for(int i=x;i>=1;i--){
					count += dp[0][y][i];
					dp[1][y][i]++;
				}
			}
		}
		System.out.println(count);
	}
}