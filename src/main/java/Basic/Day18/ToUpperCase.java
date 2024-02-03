package Basic.Day18;

public class ToUpperCase {
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp,alp.toUpperCase());
        return answer;
    }
}
