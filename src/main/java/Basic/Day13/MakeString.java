package Basic.Day13;

public class MakeString {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        String str = "";
        for(int i=0; i<parts.length;i++){
            str = my_strings[i].substring(parts[i][0],parts[i][1]+1);
            answer += str;
        }
        return answer;
    }
}
