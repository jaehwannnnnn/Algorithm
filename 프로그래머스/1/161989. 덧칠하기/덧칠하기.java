class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int brush = section[0] + m -1;
        for(int i=0;i<section.length;i++){
            if(brush >= section[i]){
                continue;
            }else if(section[i] > brush){
                answer++;
                brush = section[i] + m - 1;
            }
        }
        return answer;
    }
}