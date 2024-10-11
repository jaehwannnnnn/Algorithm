import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map <String, Integer> map = new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
            }else{
                map.put(clothes[i][1], 1);
            }
        }
        int[][] count = new int[map.size()][2];
        
        List<String> keys = new ArrayList<>(map.keySet());

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            int value = map.get(key);
            count[i][0] = i; 
            count[i][1] = value; 
        }
        for(int i=0;i<count.length;i++){
            answer *= (count[i][1] + 1);
        }
        
        return (answer - 1);
    }
}