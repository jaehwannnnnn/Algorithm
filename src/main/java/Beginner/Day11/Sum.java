package Beginner.Day11;

public class Sum {
    public int solution(int n) {
        String answer = Integer.toString(n);
        int sum = 0;
        String[] ans = answer.split("");
        for(int i=0;i<ans.length;i++){
            sum += Integer.parseInt(ans[i]);
        }
        return sum;
    }
}
