package Beginner.Day18;

public class Z {
    public int solution(String s) {
        int answer = 0;
        String[] strarr = s.split(" ");
        for(int i=0;i<strarr.length;i++){
            if(strarr[i].equals("Z")){
                answer -= Integer.parseInt(strarr[i-1]);
            }else{
                answer += Integer.parseInt(strarr[i]);
            }
        }
        return answer;
    }
}
