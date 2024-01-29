package Basic.Day13;

public class LetterIntoString {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i=0; i<index_list.length;i++){
            char a = my_string.charAt(index_list[i]);
            answer += a;
        }
        return answer;
    }
}
