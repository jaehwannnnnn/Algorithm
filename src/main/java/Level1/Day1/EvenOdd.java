package Level1.Day1;

public class EvenOdd {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }
}
