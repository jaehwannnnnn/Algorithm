import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int N = Integer.parseInt(inputs[0]);
		int M = Integer.parseInt(inputs[1]);
		int K = Integer.parseInt(inputs[2]);
		List<Integer>[] graph = new ArrayList[N+1];
		for(int i=1;i<=N;i++){
			graph[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++){
			String[] strarr = br.readLine().split(" ");
			int a = Integer.parseInt(strarr[0]);
			int b = Integer.parseInt(strarr[1]);
			graph[a].add(b);
			graph[b].add(a);
		}
		for(int i=1;i<=N;i++){
			Collections.sort(graph[i]);
		}
		boolean[] visited = new boolean[N+1];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(K);
		visited[K] = true;
		int count = 0;
		int lastNode = K;
		while(!queue.isEmpty()){
			int node = queue.poll();
			count++;
			lastNode = node;
			for(int i=0;i<graph[node].size();i++){
				if(!visited[graph[node].get(i)]){
					visited[graph[node].get(i)] = true;
					queue.add(graph[node].get(i));
					break;
				}
			}
		}
		System.out.println(count + " " + lastNode);
	}
}