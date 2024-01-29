package Basic.Day11;

import java.util.ArrayList;
import java.util.List;

public class MakeSequence4 {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if(stk.size()==0){
                stk.add(arr[i]);
                i++;
            }
            else if(stk.size() != 0 && stk.get(stk.size()-1)<arr[i]){
                stk.add(arr[i]);
                i++;
            }
            else if(stk.size() != 0 && stk.get(stk.size()-1)>=arr[i]){
                stk.remove(stk.get(stk.size()-1));
            }
        }
        int[] answer = stk.stream()
                .mapToInt(k -> k)
                .toArray();

        return answer;
    }
}
