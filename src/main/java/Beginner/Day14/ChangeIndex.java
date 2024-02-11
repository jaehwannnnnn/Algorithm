package Beginner.Day14;

public class ChangeIndex {
    public String solution(String my_string, int num1, int num2) {
        String[] strarr = my_string.split("");
        String str = strarr[num1];
        strarr[num1] = strarr[num2];
        strarr[num2] = str;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strarr.length;i++){
            sb.append(strarr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}
