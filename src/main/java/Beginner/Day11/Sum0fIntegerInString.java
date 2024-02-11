package Beginner.Day11;

public class Sum0fIntegerInString {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.toLowerCase().replaceAll("[a-z]","");

        String[] strarr = str.split("");
        for(int i=0;i<strarr.length;i++){
            answer += Integer.parseInt(strarr[i]);
        }
        return answer;
    }
}
