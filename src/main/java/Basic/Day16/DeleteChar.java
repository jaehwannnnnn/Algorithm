package Basic.Day16;

import java.util.Arrays;

public class DeleteChar {
    public String solution(String my_string, int[] indices) {
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        Arrays.sort(indices);
        for(int i=0;i<indices.length;i++){
            sb.deleteCharAt(indices[i]-i);
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}
