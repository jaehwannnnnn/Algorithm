package Beginner.Day17;

public class Factorial {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=10;i++){
            if(factorial(i)<=n){
                answer = i;
            }else{
                break;
            }
        }
        return answer;
    }
    public int factorial(int num){
        if(num <=1) return 1;
        else return num * factorial(num -1);
    }
}
