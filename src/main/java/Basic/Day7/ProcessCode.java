package Basic.Day7;

public class ProcessCode {
    public String solution(String code) {
        String answer = "";

        int mode = 0;
        for(int i=0; i<code.length(); i++){
            if(mode == 0){
                if(i%2 == 0 && code.charAt(i)!= '1') {
                    answer += code.charAt(i);
                }
                else if(code.charAt(i)=='1')
                    mode = 1;
            }else if(mode ==1){
                if(i%2 ==1 && code.charAt(i)!= '1'){
                    answer += code.charAt(i);
                }
                else if(code.charAt(i)=='1')
                    mode = 0;
            }
        }
        if(answer == "")
            return "EMPTY";
        return answer;
    }
}
