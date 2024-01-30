package Basic.Day15;

import java.util.ArrayList;
import java.util.List;

public class Blank2 {public String[] solution(String my_string) {
    String[] str = my_string.split(" ");
    List<String> answer = new ArrayList<>();
    for(int i=0;i<str.length;i++){
        if(str[i].equals("")){
            continue;
        }else{
            answer.add(str[i]);
        }
    }

    return answer.stream().toArray(String[]::new);


}
}
