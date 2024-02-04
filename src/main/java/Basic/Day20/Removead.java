package Basic.Day20;

import java.util.ArrayList;
import java.util.List;

public class Removead {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].contains("ad")){
                continue;
            }else{
                answer.add(strArr[i]);
            }
        }
        return answer.stream().toArray(String[]::new);
    }
}
