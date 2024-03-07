package Beginner.Day20;

import java.util.ArrayList;
import java.util.List;

public class NumberOf7 {
    public int solution(int[] array) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            list.add(Integer.toString(array[i]));
        }
        String[] strarr = list.stream().toArray(String[]::new);
        for(int i=0;i<strarr.length;i++){
            String[] str = strarr[i].split("");
            for(int j=0;j<str.length;j++){
                if(Integer.parseInt(str[j]) == 7){
                    answer++;
                }
            }
        }
        return answer;
    }
}
