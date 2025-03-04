import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		Set<String> set = new HashSet<>();
		for(int i=1;i<N-1;i++){
			for(int j=i+1;j<N;j++){
				String part1 = str.substring(0,i);
				String part2 = str.substring(i,j);
				String part3 = str.substring(j);
				set.add(part1);
				set.add(part2);
				set.add(part3);
			}
		}
		List<String> list = new ArrayList<>(set);
		Collections.sort(list);
		int maxScore = 0;
		for(int i=1;i<N-1;i++){
			for(int j=i;j<N;j++){
				String part1 = str.substring(0,i);
				String part2 = str.substring(i,j);
				String part3 = str.substring(j);
				int score = list.indexOf(part1) + 1 + list.indexOf(part2)+1 + list.indexOf(part3)+1;
				maxScore = Math.max(maxScore, score);
			}
		}
		System.out.println(maxScore);
	}
}