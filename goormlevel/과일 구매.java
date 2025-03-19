import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        long K = Long.parseLong(input[1]);
        Map<Long, Long> fruits = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String[] sarr = br.readLine().split(" ");
            long count = Long.parseLong(sarr[0]);
            long fruit = Long.parseLong(sarr[1]);
            long key = fruit / count;
            fruits.put(key, fruits.getOrDefault(key, 0L) + count);
        }
        
        List<Map.Entry<Long, Long>> entryList = new ArrayList<>(fruits.entrySet());
        entryList.sort((entry1, entry2) -> Long.compare(entry2.getKey(), entry1.getKey()));
        long sum = 0;
        for (int i = 0; i < entryList.size(); i++) {
            long key = entryList.get(i).getKey();
            long value = entryList.get(i).getValue();
            if (K <= value) {
                sum += key * K;
                break;
            } else {
                sum += key * value;
                K -= value;
            }
        }
        System.out.println(sum);
    }
}