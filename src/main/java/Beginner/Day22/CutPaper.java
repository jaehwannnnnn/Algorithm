package Beginner.Day22;

public class CutPaper {
    public int solution(int M, int N) {
        int answer = 0;
        if(M != 1 && N != 1){
            if(M>N){
                answer = (N-1) + (M-1) * N;
            }else{
                answer = (M-1) + (N-1) * M;
            }
        }else if(M ==1){
            answer = N-1;
        }else if(N ==1){
            answer = M-1;
        }
        return answer;
    }
}
