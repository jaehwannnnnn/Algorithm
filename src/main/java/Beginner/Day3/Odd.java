package Beginner.Day3;

import java.util.ArrayList;
import java.util.List;

public class Odd {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<=n;i+=2){
            answer.add(i);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
