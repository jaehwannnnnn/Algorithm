package Basic.Day24;

public class Integer {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int rowStart =0;
        int rowEnd = n-1;
        int colStart =0;
        int colEnd =n-1;
        while(num <= n*n){
            for(int i=colStart;i<=colEnd;i++){
                answer[rowStart][i] = num;
                num++;
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                answer[i][colEnd] = num;
                num++;
            }
            colEnd--;
            for(int i=colEnd;i>=colStart;i--){
                answer[rowEnd][i]=num;
                num++;
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                answer[i][colStart]=num;
                num++;
            }
            colStart++;
        }
        return answer;
    }
}
