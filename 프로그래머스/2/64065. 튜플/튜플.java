import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        String str = s.substring(2,s.length()-2);
        String[] parts = str.split("},\\{");
        for (String string : parts) {
            if (!string.contains(",")) { 
                int value = Integer.parseInt(string);
                if (!list.contains(value)) {
                    list.add(value);
                }
            }
        }
        Arrays.sort(parts, Comparator.comparingInt(String::length));
        for (String string : parts) {
            if (string.contains(",")) {
                String[] numbers = string.split(",");
                for (String num : numbers) {
                    int value = Integer.parseInt(num);
                    if (!list.contains(value)) {
                        list.add(value);
                    }
                }
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}