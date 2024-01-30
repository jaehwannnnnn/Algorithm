package Basic.Day14;

import java.util.ArrayList;
import java.util.List;

public class CountDown {
    public int[] solution(int start, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for(int i = start;i>=end_num;i--){
            answer.add(i);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
