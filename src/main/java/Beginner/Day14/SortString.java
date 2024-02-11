package Beginner.Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortString {
    public int[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String str = my_string.replaceAll("[a-z]","");
        String[] strs = str.split("");
        for(int i=0;i<strs.length;i++){
            answer.add(strs[i]);
        }
        String[] strarr =answer.stream().toArray(String[]::new);
        int[] intarr = new int[strarr.length];
        for(int i=0;i<strarr.length;i++){
            intarr[i] = Integer.parseInt(strarr[i]);
        }
        Arrays.sort(intarr);
        return intarr;
    }
}
