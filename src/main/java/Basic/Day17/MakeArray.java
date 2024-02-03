package Basic.Day17;

import java.util.ArrayList;
import java.util.List;

public class MakeArray {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for(int i =0;i<intervals.length;i++){
            for(int k=intervals[i][0];k<=intervals[i][1];k++){
                answer.add(arr[k]);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
