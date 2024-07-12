class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String str = "";
        int zeroCount = 0;
        int count = 0;
        if(s.equals("1")){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            while(!s.equals("1")){
                str = s.replaceAll("0","");
                zeroCount += s.length() - str.length();
                s = Integer.toBinaryString(str.length());
                count++;
            }
            answer[0] = count;
            answer[1] = zeroCount;
        }
        
        return answer;
    }
}