package Basic.Day3;

public class MultiplyString {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i=0;i<k;i++){
            answer += my_string;
        }
        return answer;
    }
}
