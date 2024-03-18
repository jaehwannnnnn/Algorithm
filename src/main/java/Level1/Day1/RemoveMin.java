package Level1.Day1;

import java.util.ArrayList;
import java.util.List;

public class RemoveMin {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int min = 1000000000;
        int idx = 0;
        int[] a = new int[]{-1};
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
                idx = i;
            }
        }
        for(int i =0;i<arr.length;i++){
            if(i != idx){
                answer.add(arr[i]);
            }
        }
        if(arr.length != 1){
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }else{
            return a;
        }
    }
}
