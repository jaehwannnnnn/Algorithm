package Beginner.Day15;

public class FindNum {
    public int solution(int num, int k) {
        int answer = -1;
        String s = Integer.toString(k);
        String str = Integer.toString(num);
        String[] strarr = str.split("");
        for(int i=0;i<strarr.length;i++){
            if(strarr[i].equals(s)){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
