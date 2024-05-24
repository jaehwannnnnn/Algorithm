class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase(); 
        
        String regex = "[^a-z0-9\\-._]";
        answer = answer.replaceAll(regex, "");

        answer = answer.replaceAll("\\.{2,}", ".");

        answer = answer.replaceAll("^\\.|\\.$", "");
   
        if(answer.equals("")){
            answer = "a";
        }

        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$", ""); // 끝의 점 제거
        }

        while(answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}
