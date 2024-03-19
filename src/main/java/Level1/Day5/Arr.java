package Level1.Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
