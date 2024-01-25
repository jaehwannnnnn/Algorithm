package Basic.Day4;

public class EvenOdd {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){
            int sum = 0;
            for(int i=n;i>0;i--){
                if(i%2==0){
                    sum += i*i;
                }
            }
            return sum;
        }else{
            for(int j=n;j>0;j--){
                if(j%2==1)
                    answer += j;
            }
            return answer;
        }
    }
}
