package Beginner.Day14;

import java.util.ArrayList;
import java.util.List;

public class Divisor {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}
