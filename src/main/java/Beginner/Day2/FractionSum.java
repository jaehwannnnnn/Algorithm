package Beginner.Day2;

public class FractionSum {public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int[] answer = new int[2];
    int num3 = numer2 * denom1 + numer1 * denom2;
    int denom3 = denom1 * denom2;
    int max =0;
    for(int i=1; i<=num3 && i<= denom3;i++){
        if(num3%i ==0 && denom3%i==0){
            max = i;
        }
    }
    answer[0] = num3 / max;
    answer[1] = denom3 / max;
    return answer;
}
}
