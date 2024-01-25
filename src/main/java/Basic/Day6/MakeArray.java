package Basic.Day6;

public class MakeArray {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int a =0;
        for(int i=1; i<=n ; i++){

            if(i % k == 0){
                answer[a] = i;
                a++;
            }

        }
        return answer;
    }
}
