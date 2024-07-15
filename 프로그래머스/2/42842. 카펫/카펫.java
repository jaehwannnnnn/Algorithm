class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int temp1 = 0;
        int temp2 =0;
        for(int i=brown;i>=1;i--){
            for(int k=1;k<brown;k++){
                temp1 = i;
                temp2 = k;
                if(((2*temp1) + (2*(temp2 -2)) == brown) && ((temp1 -2) *(temp2 -2) == yellow)){
                    answer[0] = temp1;
                    answer[1] = temp2;
                    break;
                } 
            }
        }
        int temp = answer[0];
        answer[0] = answer[1];
        answer[1] = temp;
        return answer;
    }
}