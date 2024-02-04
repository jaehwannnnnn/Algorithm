package Basic.Day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSort {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        List<String> list = new ArrayList<>();
        for(int i=0;i<answer.length;i++){
            if(answer[i].equals("")){
                continue;
            }else{
                list.add(answer[i]);
            }
        }
        return list.stream().toArray(String[]::new);
    }
}
