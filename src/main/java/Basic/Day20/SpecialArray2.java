package Basic.Day20;

public class SpecialArray2 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                if(i == k){
                    answer[i][k] = 1;
                }else{
                    answer[i][k] = 0;
                }
            }
        }
        return answer;
    }
}
