package Basic.Day22;

public class Make1 {
    public int solution(int[] num) {
        int answer = 0;
        for(int i=0;i<num.length;i++){
            while(num[i] != 1){
                if(num[i]==1){
                    break;
                }else if(num[i]%2 == 1){
                    num[i]--;
                }else{
                    num[i] = num[i] / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}
