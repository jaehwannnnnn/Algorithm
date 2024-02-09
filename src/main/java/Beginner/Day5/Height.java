package Beginner.Day5;

import java.util.Arrays;

public class Height {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            if(height < array[i]){
                answer++;
            }
        }
        return answer;
    }
}
