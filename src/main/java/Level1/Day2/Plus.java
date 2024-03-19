package Level1.Day2;

public class Plus {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] strarr = str.split("");
        for(int i=0;i<strarr.length;i++){
            answer += Integer.parseInt(strarr[i]);
        }
        return answer;
    }
}
