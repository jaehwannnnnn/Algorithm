class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0;i<answer.length;i++){
            answer[i] =0;
        }
        for(int i=0;i<photo.length;i++){
            for(int k=0;k<photo[i].length;k++){
                for(int j=0;j<name.length;j++){
                    if(photo[i][k].equals(name[j])){
                        answer[i] += yearning[j]; 
                    }
                }
            }
        }
        
        return answer;
    }
}