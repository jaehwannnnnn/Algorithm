package Beginner.Day15;

import java.util.Arrays;

public class SortString2 {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        String[] strarr = answer.split("");
        Arrays.sort(strarr);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strarr.length;i++){
            sb.append(strarr[i]);
        }
        return sb.toString();
    }
}
