package Beginner.Day8;
import java.util.*;
public class RepeatString {
    public String solution(String my_string, int n) {
        String[] strarr = my_string.split("");
        List<String> list = new ArrayList<>();
        for(int i=0;i<strarr.length;i++){
            for(int k=0;k<n;k++){
                list.add(strarr[i]);
            }
        }
        String[] str = list.stream().toArray(String[]::new);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}
