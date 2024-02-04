package Basic.Day20;

public class SImpleCalculate {
    public int solution(String binomial) {
        String[] bi = binomial.split(" ");
        int answer = 0;
        int a = Integer.parseInt(bi[0]);
        int b = Integer.parseInt(bi[2]);
        if(bi[1].equals("+")){
            answer = a + b;
        }else if(bi[1].equals("-")){
            answer = a - b;
        }else{
            answer = a*b;
        }
        return answer;
    }
}
