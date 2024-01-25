package Basic.Day7;

public class ManipulateNumbers {
    public int solution(int n, String control) {
        int answer = 0;
        if(control.charAt(0) == 'w')
            answer += n + 1;
        else if(control.charAt(0) == 's')
            answer += n - 1;
        else if(control.charAt(0) == 'd')
            answer += n + 10;
        else if(control.charAt(0) == 'a')
            answer += n - 10;
        for(int i=1;i<control.length();i++)
        {
            if(control.charAt(i) == 'w')
                answer += 1;
            else if(control.charAt(i) == 's')
                answer -= 1;
            else if(control.charAt(i) == 'd')
                answer += 10;
            else if(control.charAt(i) == 'a')
                answer -= 10;
        }
        return answer;
    }
}
