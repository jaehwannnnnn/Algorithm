class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] result = dartResult.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        for(int i = 1;i< result.length;i+=2){
            if(result[i].charAt(0) == 'S'){
                
            }else if(result[i].charAt(0) == 'D'){
                result[i-1] = Integer.toString(Integer.parseInt(result[i-1]) * Integer.parseInt(result[i-1]));
                
            }else if(result[i].charAt(0) == 'T'){
                result[i-1] = Integer.toString(Integer.parseInt(result[i-1]) * Integer.parseInt(result[i-1]) * Integer.parseInt(result[i-1]));
                
            }
            if(result[i].length() >=2){
                if(i == 1 && result[i].charAt(1) == '*'){
                    result[0] = Integer.toString(2 * Integer.parseInt(result[0]));
                }else if(i > 1 && result[i].charAt(1) == '*'){
                    result[i-3] = Integer.toString(2 * Integer.parseInt(result[i-3]));
                    result[i -1] = Integer.toString(2 * Integer.parseInt(result[i-1]));
                }else if(result[i].charAt(1) == '#'){
                    result[i - 1] = Integer.toString(-1 * Integer.parseInt(result[i - 1]));
                }
            }
        }
        for(int i=0;i<result.length;i+=2){
            answer += Integer.parseInt(result[i]);
        }
        return answer;
    }
}