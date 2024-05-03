import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int idx =0;
        int[] reverse = new int[score.length];
        Arrays.sort(score);        
        for(int i=0;i<score.length;i++){
            reverse[i] = score[i];
        }
        for(int i=score.length -1;i>=0;i--){
            score[idx++] = reverse[i];
        }
        for(int i=0;i<score.length;i++){
            if(i % m == m - 1){
                answer += (score[i] * m);
            }
        }
        return answer;
    }
}