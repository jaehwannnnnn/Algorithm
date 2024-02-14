package Beginner.Day17;

public class TwoDimension {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx =0;
        for(int i=0;i<answer.length;i++){
            for(int k=0;k<n;k++){
                answer[i][k] = num_list[idx++];
            }
        }
        return answer;
    }
}
