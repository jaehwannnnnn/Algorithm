import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        LinkedList<String> cache = new LinkedList<>();
        int answer = 0;

        for (String city : cities) {
            city = city.toUpperCase();

            if (cache.contains(city)) {
                cache.remove(city);
                cache.addLast(city);
                answer += 1;
            } else {
                if (cache.size() == cacheSize) {
                    cache.removeFirst();
                }
                cache.addLast(city);
                answer += 5;
            }
        }

        return answer;
    }
}
