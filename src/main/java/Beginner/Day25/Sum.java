package Beginner.Day25;

public class Sum {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int odd = 0;
        int even = 0;
        int idx = 0;
        if(num % 2 == 1){
            odd = total / num;
            for(int i = odd - (num/2);i<=odd + (num/2);i++){
                answer[idx++] = i;
            }
        }else{
            even = total/num;
            for(int i = even - (num/2 - 1);i<= even + (num/2);i++){
                answer[idx++] = i;
            }
        }
        return answer;
    }
}
