package Basic.Day22;

import java.util.ArrayList;
import java.util.List;

public class PowerOf2 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            answer.add(arr[i]);
        }
        for(int i=0;i<11;i++){
            if(arr.length == Math.pow(2,i)){
                break;
            }else if(arr.length<Math.pow(2,i)){
                for(int k =0;k<Math.pow(2,i)-arr.length;k++){
                    answer.add(0);
                }
                break;
            }
        }
        return answer.stream().mapToInt(j->j).toArray();
    }
}
