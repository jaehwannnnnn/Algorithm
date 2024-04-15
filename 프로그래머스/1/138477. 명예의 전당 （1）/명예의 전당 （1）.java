import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] numbers = new int[score.length];
        int[] answer = new int[k];        
        for(int i=0;i<k;i++){
            answer[i] = Integer.MAX_VALUE;
        }  
        
        
        if(k < score.length){
            for(int i=0;i<k;i++){
                answer[i] = score[i];
                Arrays.sort(answer);
                numbers[i] = answer[0];
            }
        }else{
            for(int j = 0;j<score.length;j++){
                answer[j] = score[j];
                Arrays.sort(answer);
                numbers[j] = answer[0];
            }
        }
        if(k < score.length){
            for(int i=k;i<score.length;i++){
                if(score[i] > answer[0]){
                    answer[0] = score[i];
                }
                Arrays.sort(answer);
                numbers[i] = answer[0];
            }
        }
        return numbers;
    }
}