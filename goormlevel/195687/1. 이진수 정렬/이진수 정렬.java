import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		String[] strarr = br.readLine().split(" ");
		int[][] nums = new int[strarr.length][2];
		for(int i=0;i<nums.length;i++){
			nums[i][0] = Integer.parseInt(strarr[i]);
			nums[i][1] = Integer.bitCount(nums[i][0]);
		}
		Arrays.sort(nums, (a, b) -> {
			int oneCount = Integer.compare(b[1], a[1]);
			if(oneCount !=0){
				return oneCount;
			}
			return Integer.compare(b[0], a[0]);
		});
		System.out.println(nums[K-1][0]);
	}
}