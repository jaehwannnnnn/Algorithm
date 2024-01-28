package Basic.Day12;
import java.util.ArrayList;
import java.util.List;

public class Add {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr[i];k++){
                answer.add(arr[i]);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}