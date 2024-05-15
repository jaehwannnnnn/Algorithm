class Solution {
    public int solution(String s) {
        int answer = 0;
        int currentidx = 0;
        while(currentidx < s.length() -1){
            int count1 = 0;
            int count2 = 0;
            for(int i=currentidx;i<s.length();i++){
                char ch = s.charAt(currentidx);
                if(i == s.length() - 1){
                    answer++;
                    currentidx = s.length() -1;
                }else{
                    if(s.charAt(i) == ch){
                        count1++;
                    }else{
                        count2++;
                    }
                    if(count1 == count2){
                       if(i + 1 != s.length() - 1){
                           currentidx = i+1;
                           answer++;
                           break;
                       }else{
                           answer++;
                       }
                    }
                }
            }
        }
        if(s.length() == 1){
            answer = 1;
        }
        return answer;
    }
}