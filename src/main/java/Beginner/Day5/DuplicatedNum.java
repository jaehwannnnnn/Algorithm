package Beginner.Day5;

public class DuplicatedNum {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            if(n == array[i]){
                answer++;
            }
        }
        return answer;
    }
}
