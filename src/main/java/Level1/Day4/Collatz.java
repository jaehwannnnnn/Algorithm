package Level1.Day4;

public class Collatz {
    public int solution(int num) {
        int answer = 0;
        Long numl = (long) num;
        while(numl != 1){
            if(numl % 2 == 0){
                numl = numl /2;
                answer++;
            }else{
                numl = numl *3 +1;
                answer++;
            }
            if(answer > 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
