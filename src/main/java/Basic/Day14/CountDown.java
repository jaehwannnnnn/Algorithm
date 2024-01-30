package Basic.Day14;

import java.util.ArrayList;
import java.util.List;

public class CountDown {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num +1];
        for (int i = start; i <= end_num; i--) {
            answer[i] = i;
        }
        return answer;
    }
}
