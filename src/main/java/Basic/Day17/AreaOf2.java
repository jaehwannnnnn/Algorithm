package Basic.Day17;

import java.util.ArrayList;
import java.util.List;

public class AreaOf2 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int[] ans = new int[] {-1};
        int a =0;
        int b =0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 2){
                a = i;
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 2){
                b = i;
                count++;
            }
        }
        for(int i=a;i<=b;i++){
            answer.add(arr[i]);
        }
        if(count == 0){
            return ans;
        }else
            return answer.stream().mapToInt(i->i).toArray();
    }
}
