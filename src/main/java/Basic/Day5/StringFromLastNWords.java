package Basic.Day5;

public class StringFromLastNWords {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length()-n);

        return answer;
    }
}
