import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String str = s.substring(s.lastIndexOf('.') + 1);
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        List<String> keys = new ArrayList<>(map.keySet());
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
    }
}
