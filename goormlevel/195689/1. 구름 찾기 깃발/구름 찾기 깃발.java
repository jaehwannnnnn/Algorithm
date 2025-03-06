import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		int[][] clouds = new int[N][N];
		int[][] flags = new int[N][N];
		for(int i=0;i<clouds.length;i++){
			String[] nums = br.readLine().split(" ");
			for(int j=0;j<clouds[i].length;j++){
				
				clouds[i][j] = Integer.parseInt(nums[j]);
			}
		}
		int rowStart = 0;
		int rowEnd = flags.length - 1;
		int colStart = 0;
		int colEnd = flags.length - 1;
		for(int i=rowStart;i<=rowEnd;i++){
			for(int j=colStart;j<=colEnd;j++){
				int count = 0;
				int[] dx = {-1,-1,-1,0,0,1,1,1};
				int[] dy = {-1,0,1,-1,1,-1,0,1};
				if(clouds[i][j] == 0){
					for(int k=0;k<dx.length;k++){
						int currentX = i + dx[k];
						int currentY = j + dy[k];
						if(currentX >=0 && currentY >=0 && currentX < N && currentY<N){
							if(clouds[currentX][currentY] == 1){
								count++;
							}
						}
						flags[i][j] = count;
					}
				}
			}
		}
		int answer = 0;
		for(int i=0;i<flags.length;i++){
			for(int j=0;j<flags.length;j++){
				if(flags[i][j] == K){
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}