package Beginner.Day20;

import java.util.ArrayList;
import java.util.List;

public class OXQuiz {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        for(int i=0;i<quiz.length;i++){
            String[] strarr = quiz[i].split(" ");
            int count = 0;
            if(strarr[1].equals("+")){
                count = Integer.parseInt(strarr[0]) + Integer.parseInt(strarr[2]);
            }else if(strarr[1].equals("-")){
                count = Integer.parseInt(strarr[0]) - Integer.parseInt(strarr[2]);
            }
            if(count == Integer.parseInt(strarr[4])){
                answer.add("O");
            }else{
                answer.add("X");
            }
        }
        return answer.stream().toArray(String[]::new);
    }
}
