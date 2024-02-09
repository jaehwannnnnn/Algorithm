package Beginner.Day6;

public class ReverseString {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        String[] strarr = new String[str.length];
        int idx =0;
        for(int i=str.length-1;i>=0;i--){
            strarr[idx++] = str[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strarr.length;i++){
            sb.append(strarr[i]);
        }
        return sb.toString();
    }
}
