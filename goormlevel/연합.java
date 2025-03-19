import java.io.*;
import java.util.*;
class Main {
	static List<Integer>[] islands;
	static boolean[] visited;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		islands = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=0;i<N+1;i++){
			islands[i] = new ArrayList<>();
		}

		for(int i=0;i<M;i++){
			String[] arr = br.readLine().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			islands[a].add(b);
		}
		
		int alliance = 0;
		for(int i=1;i<=N;i++){
			if(!visited[i]){
				DFS(i);
				alliance++;
			}
		}
		System.out.println(alliance);
	}
	public static void DFS(int island){
		visited[island] = true;
		for(int i=0;i<islands[island].size();i++){
			int next = islands[island].get(i);
			if(!visited[next] && islands[next].contains(island)){
				DFS(next);
			}
		}
	}
}