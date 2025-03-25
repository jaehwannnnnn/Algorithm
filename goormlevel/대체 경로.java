import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int S = Integer.parseInt(input[2]);
		int E = Integer.parseInt(input[3]);
		
		List<Integer>[] cities = new ArrayList[N+1];
		for(int i=0;i<=N;i++){
			cities[i] = new ArrayList<>();
		}
		
		for(int i=0;i<M;i++){
			String[] strarr = br.readLine().split(" ");
			int s = Integer.parseInt(strarr[0]);
			int e = Integer.parseInt(strarr[1]);
			cities[s].add(e);
			cities[e].add(s);
		}

		for(int x=1;x<=N;x++){
			if(x == S || x == E){
				System.out.println(-1);
			}else{
				int[] visited = new int[N+1];
				Arrays.fill(visited, Integer.MAX_VALUE);
				Queue<Integer> queue = new LinkedList<>();
				queue.add(S);
				visited[S] = 1;
				while(!queue.isEmpty()){
					int currentCity = queue.poll();
					for(int i=0;i<cities[currentCity].size();i++){
						int nextCity = cities[currentCity].get(i);
						if(nextCity != x){
							if(visited[nextCity] > visited[currentCity] + 1){
								visited[nextCity] = visited[currentCity] + 1;
								queue.add(nextCity);
							}
						}
						if(nextCity == E){
							break;
						}
					}
				}
				System.out.println(visited[E] == Integer.MAX_VALUE ? -1 : visited[E]);
			}
		}
	}
}