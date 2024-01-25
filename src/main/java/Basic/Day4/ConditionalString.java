package Basic.Day4;

public class ConditionalString {
    public int solution(String ineq, String eq, int n, int m) {

        boolean answer;
        if(ineq.equals(">")){
            if(eq.equals("="))
                answer = n >= m;
            else
                answer = n > m;
        }else if(eq.equals("="))
            answer = n <= m;
        else
            answer = n < m;
        if(answer == true)
            return 1;
        else
            return 0;
    }
}
