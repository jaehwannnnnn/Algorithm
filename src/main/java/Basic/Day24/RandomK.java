package Basic.Day24;

import java.util.ArrayList;

public class RandomK {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(answer.size() == k)
                break;
            if(!answer.contains(arr[i])){
                answer.add(arr[i]);
            }
        }
        while(answer.size() < k){
            answer.add(-1);
        }
        return answer.stream().mapToInt(j->j).toArray();
    }
}
