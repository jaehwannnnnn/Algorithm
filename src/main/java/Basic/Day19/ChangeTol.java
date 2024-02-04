package Basic.Day19;

public class ChangeTol {
    public String solution(String myString) {
        String[] answer = myString.split("");
        for(int i=0; i<answer.length;i++){
            if(myString.charAt(i) < 'l'){
                answer[i] = "l";
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<answer.length;i++){
            sb.append(answer[i]);
        }
        String ans = sb.toString();
        return ans;
    }
}
