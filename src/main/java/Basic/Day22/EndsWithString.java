package Basic.Day22;
import java.util.*;

public class EndsWithString {
    public String solution(String myString, String pat) {
        List<String> list = new ArrayList<>();
        String[] pats = pat.split("");
        String[] str = myString.split("");
        for(int i = str.length - 1;i>=0;i--){
            if(pats[pats.length-1].equals(str[i])){
                for(int k=0;k<=i;k++){
                    list.add(str[k]);
                }
                break;
            }
        }
        String[] answer = list.stream().toArray(String[]::new);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<answer.length;i++){
            sb.append(answer[i]);
        }
        String ans = sb.toString();
        return ans;
    }
}
