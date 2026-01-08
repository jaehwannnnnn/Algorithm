import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(' ');
        for (int next : graph[v]) {
            if (!visited[next]) dfs(next);
        }
    }

    static void bfs(int start) {
        Arrays.fill(visited, false);
        Queue<Integer> q = new ArrayDeque<>();
        visited[start] = true;
        q.offer(start);
        while (!q.isEmpty()) {
            int v = q.poll();
            sb.append(v).append(' ');
            for (int nxt : graph[v]) {
                if (!visited[nxt]) {
                    visited[nxt] = true;
                    q.offer(nxt);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        visited = new boolean[N + 1];
        dfs(V);
        sb.append('\n');
        bfs(V);
        System.out.print(sb);
    }
}
