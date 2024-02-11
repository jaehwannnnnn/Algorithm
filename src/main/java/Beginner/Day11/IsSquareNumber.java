package Beginner.Day11;

public class IsSquareNumber {
    public int solution(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count % 2 == 1) return 1;
        else return 2;
    }
}
