import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }
        
        List<Integer> result = new ArrayList<>();
        int index = 0;
        while (!people.isEmpty()) {
            index = (index + K - 1) % people.size();
            result.add(people.remove(index));
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i != result.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append('>');
        System.out.println(sb);
    }
}
