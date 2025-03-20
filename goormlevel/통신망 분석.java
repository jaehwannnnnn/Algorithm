import java.io.*;
import java.util.*;

class Main {
    static List<Integer>[] computers;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        computers = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for(int i=0; i<= N;i++) {
            computers[i] = new ArrayList<>();
        }
        for(int i=0; i<M;i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            computers[a].add(b);
            computers[b].add(a);
        }
        int minComputers = N+1;
        int minNumbers = N+1;
        double maxDensity = -1;
        List<Integer> bestComponent = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                List<Integer> currentComponent = new ArrayList<>();
                int[] arr = iterativeDFS(i, currentComponent);
                int totalEdges = arr[0] / 2;
                int totalNodes = arr[1];
                double density = (double) totalEdges / totalNodes;
                int minValue = currentComponent.isEmpty() ? Integer.MAX_VALUE : Collections.min(currentComponent);
                if (maxDensity < density ||
                    maxDensity == density && minComputers > totalNodes ||
                    maxDensity == density && minComputers == totalNodes && minValue < minNumbers) {
                    maxDensity = density;
                    minComputers = totalNodes;
                    minNumbers = minValue;
                    bestComponent = new ArrayList<>(currentComponent);
                }
            }
        }
        Collections.sort(bestComponent);
        for(int i=0;i<bestComponent.size();i++) {
            System.out.print(bestComponent.get(i) + " ");
        }
    }
    public static int[] iterativeDFS(int start, List<Integer> component) {
        Stack<Integer> stk = new Stack<>();
        stk.push(start);
        visited[start] = true;
        component.add(start);
        int lineCount = 0;
        int computerCount = 1;
        while (!stk.isEmpty()) {
            int com = stk.pop();		
            for(int i=0;i<computers[com].size();i++) {
                if(!visited[computers[com].get(i)]) {
                    visited[computers[com].get(i)] = true;
                    stk.push(computers[com].get(i));
                    component.add(computers[com].get(i));
                    computerCount++;
                }
                lineCount++;
            }
        }
        return new int[]{lineCount, computerCount};
    }
}
