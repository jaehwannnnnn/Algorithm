class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[][] sarr = new String[8][2];
        sarr[0][0] = "R"; sarr[0][1] = "0";
        sarr[1][0] = "T"; sarr[1][1] = "0";
        sarr[2][0] = "C"; sarr[2][1] = "0";
        sarr[3][0] = "F"; sarr[3][1] = "0";
        sarr[4][0] = "J"; sarr[4][1] = "0";
        sarr[5][0] = "M"; sarr[5][1] = "0";
        sarr[6][0] = "A"; sarr[6][1] = "0";
        sarr[7][0] = "N"; sarr[7][1] = "0";
        for(int i = 0; i < survey.length; i++){
            for(int j = 0; j < sarr.length; j++){
                if(choices[i] < 4 && survey[i].charAt(0) == sarr[j][0].charAt(0)){
                    sarr[j][1] = String.valueOf(Integer.parseInt(sarr[j][1]) + (4 - choices[i]));
                } else if(choices[i] > 4 && survey[i].charAt(1) == sarr[j][0].charAt(0)){
                    sarr[j][1] = String.valueOf(Integer.parseInt(sarr[j][1]) + (choices[i] - 4));
                }
            }
        }

        for(int i = 0; i < sarr.length; i += 2){
            if(Integer.parseInt(sarr[i][1]) >= Integer.parseInt(sarr[i + 1][1])){
                answer += sarr[i][0];
            } else {
                answer += sarr[i + 1][0];
            }
        }

        return answer;
    }
}
