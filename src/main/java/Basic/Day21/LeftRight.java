package Basic.Day21;

import java.util.ArrayList;
import java.util.List;

public class LeftRight {
    public String[] solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")){
                for(int k=0;k<i;k++){
                    answer.add(str_list[k]);
                }
                break;
            }else if(str_list[i].equals("r")){
                for(int j=i+1;j<str_list.length;j++){
                    answer.add(str_list[j]);
                }
                break;
            }
        }
        return answer.stream().toArray(String[]::new);
    }
}
