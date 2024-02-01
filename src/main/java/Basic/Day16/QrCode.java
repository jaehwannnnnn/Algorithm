package Basic.Day16;

public class QrCode {
    public String solution(int q, int r, String code) {
        String answer = "" + code.charAt(r);
        for(int i=q;i<code.length();i++){
            if(i%q == r){
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}
