package Beginner.Day18;

import java.util.Arrays;

public class BeforeAfter {public int solution(String before, String after) {
    int answer = 0;
    int count =0;
    String[] befores = before.split("");
    String[] afters = after.split("");
    Arrays.sort(befores);
    Arrays.sort(afters);
    for(int i=0;i<befores.length;i++){
        if(befores[i].equals(afters[i])){
            count++;
        }
    }
    if(count == befores.length){
        return 1;
    }else
        return answer;
}
}
