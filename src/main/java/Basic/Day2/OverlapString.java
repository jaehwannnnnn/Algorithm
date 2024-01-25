package Basic.Day2;

public class OverlapString {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String a = my_string.substring(0, s);
        String b = my_string.substring(s + overwrite_string.length(), my_string.length());
        answer = a + overwrite_string + b;
        return answer;
    }
}

