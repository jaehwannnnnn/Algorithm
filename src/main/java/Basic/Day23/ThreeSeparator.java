package Basic.Day23;

import java.util.ArrayList;
import java.util.List;

public class ThreeSeparator {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        String[] blank = new String[]{"EMPTY"};
        List<String> list = new ArrayList<>();
        for(int i=0;i<answer.length;i++){
            if(answer[i].equals("")){
                continue;
            }else{
                list.add(answer[i]);
            }
        }
        if(answer.length == 0){
            return blank;
        }else{
            return list.stream().toArray(String[]::new);
        }
    }
}
