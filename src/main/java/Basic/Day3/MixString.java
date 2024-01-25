package Basic.Day3;

public class MixString {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int n=0; n<str1.length();n++){
            answer += str1.charAt(n);
            answer += str2.charAt(n);
        }
        return answer;
    }
}
