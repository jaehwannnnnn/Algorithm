package Basic.Day22;

public class CountingStrings {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=1;i<=myString.length();i++){
            if(myString.substring(0,i).endsWith(pat)){
                answer++;
            }
        }
        return answer;
    }
}
