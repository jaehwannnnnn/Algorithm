package Beginner.Day24;

public class PushString {
    public int solution(String A, String B) {
        int answer = 0;
        for(int i=0;i<A.length();i++){
            if(A.equals(B)){
                break;
            }
            A = move(A);
            answer++;
        }
        if(answer == A.length()){
            return -1;
        }else{
            return answer;
        }
    }
    public String move(String str){
        String[] strarr = str.split("");
        String[] duparr = new String[strarr.length];
        for(int i=0;i<strarr.length;i++){
            duparr[i] = strarr[i];
        }
        String temp = strarr[strarr.length -1];
        for(int i=1;i<strarr.length;i++){
            strarr[i] = duparr[i -1];
        }
        strarr[0] = temp;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strarr.length;i++){
            sb.append(strarr[i]);
        }
        return sb.toString();
    }
}
