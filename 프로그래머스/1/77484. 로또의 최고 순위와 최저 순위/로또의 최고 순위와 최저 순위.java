class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int correct = 0;
        for(int i=0;i<lottos.length;i++){
            if(lottos[i] == 0){
                count++;
            }else{
                for(int k=0;k<lottos.length;k++){
                    if(lottos[i] == win_nums[k]){
                        correct++;
                    }
                }
            }
        }
        int max = 0;
        int min =0;
        max = count + correct;
        min = correct;
        if(max == 6){
            answer[0] = 1;
        }else if(max == 5){
            answer[0] = 2;
        }else if(max == 4){
            answer[0] = 3;
        }else if(max == 3){
            answer[0] = 4;
        }else if(max == 2){
            answer[0] = 5;
        }else{
            answer[0] = 6;
        }
        if(min == 6){
            answer[1] =1;
        }else if(min == 5) answer[1] = 2;
        else if(min == 4) answer[1] = 3;
        else if(min == 3) answer[1] = 4;
        else if(min ==2) answer[1] = 5;
        else answer[1] = 6;
        return answer;
    }
}