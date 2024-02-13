package Beginner.Day16;

public class CompositeNumber {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[n];
        for(int i=0;i<num.length;i++){
            num[i] = i+1;
        }
        int[] count = new int[n];
        for(int i=0;i<count.length;i++){
            for(int k=1;k<=i+1;k++){
                if(num[i]%k == 0){
                    count[i]++;
                }
            }
            if(count[i]>=3){
                answer++;
            }
        }
        return answer;
    }
}
