package Beginner.Day19;

import java.util.Arrays;

public class OnlyOne {

    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] str = s.split("");
            Arrays.sort(str);
            for(int i=0;i<str.length;i++){
                int count =0;
                for(int k=0;k<str.length;k++){
                    if(str[i].equals(str[k])){
                        count++;
                    }
                }
                if(count == 1){
                    answer += str[i];
                }
            }
            return answer;
        }
    }

}
