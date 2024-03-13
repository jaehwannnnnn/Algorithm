package Beginner.Day24;

public class FiniteFraction {
    public int solution(int a, int b) {
        int answer = 2;

        for(int i=1;i<=Math.max(a,b);i++){
            if(a % i ==0 && b % i == 0){
                a = a/ i;
                b = b/i;
            }
        }
        for(int i =0;i<11;i++){
            if(b == Math.pow(2,i) || b == Math.pow(5,i))
                answer = 1;
            for(int j =0;j<11;j++){
                if(b==Math.pow(2,i)*Math.pow(5,j)){
                    answer = 1;
                }
            }
        }

        return answer;
    }
}
