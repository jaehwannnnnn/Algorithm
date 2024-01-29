package Basic.Day11;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n!=1){
            if(n%2 == 0){
                n = n /2;
                answer.add(n);
            }else{
                n = 3* n + 1;
                answer.add(n);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
