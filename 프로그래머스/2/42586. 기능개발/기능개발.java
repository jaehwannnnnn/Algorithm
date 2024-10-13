import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int[] days = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            days[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }

        int count = 1;
        int maxDay = days[0];

        for (int i = 1; i < days.length; i++) {
            if (days[i] <= maxDay) {
                count++;
            } else {
                list.add(count);
                count = 1;
                maxDay = days[i];
            }
        }
        list.add(count);
        return list.stream().mapToInt(x -> x).toArray();
    }
}
