package Level1.Day3;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOrder {
    public long solution(long n) {
        String str = "" + n;
        String[] strarr = str.split("");
        Arrays.sort(strarr);
        Collections.reverse(Arrays.asList(strarr));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strarr.length;i++){
            sb.append(strarr[i]);
        }
        String answer = sb.toString();
        return Long.parseLong(answer);
    }
}
