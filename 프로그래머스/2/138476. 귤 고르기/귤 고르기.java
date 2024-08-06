import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<tangerine.length;i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Integer> counts = new ArrayList<>(map.values());
        counts.sort(Collections.reverseOrder());
        int[] count = counts.stream().mapToInt(x->x).toArray();
        int total = 0;
        int answer = 0;
        
        for (int i=0;i<count.length;i++) {
            total += count[i];
            answer++;
            if (total >= k) {
                break;
            }
        }
        return answer;
    }
}
