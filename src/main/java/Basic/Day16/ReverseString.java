package Basic.Day16;

public class ReverseString {
    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(s,e+1);
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        String answer = my_string.substring(0,s) + reversedStr + my_string.substring(e+1);
        return answer;
    }
}
