package Beginner.Day14;

public class RotateArray {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            if(direction.equals("right")){
                if(i == 0){
                    answer[i] = numbers[numbers.length-1];
                }else{
                    answer[i] = numbers[i-1];
                }
            }else{
                if(i == numbers.length -1){
                    answer[i] = numbers[0];
                }else{
                    answer[i] = numbers[i+1];
                }
            }
        }
        return answer;
    }
}
