package Basic.Day19;

import java.util.ArrayList;
import java.util.List;

public class IndexPerN {public int[] solution(int[] num_list, int n) {
    List<Integer> answer = new ArrayList<>();
    int idx =0;
    for(int i=0; i<num_list.length;i+=n){
        answer.add(num_list[i]);
    }
    return answer.stream().mapToInt(i->i).toArray();
}
}
