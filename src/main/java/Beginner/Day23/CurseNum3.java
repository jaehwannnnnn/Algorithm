package Beginner.Day23;

public class CurseNum3 {
    public int solution(int n) {
        int answer = 1;
        int count=n;
        while(count != 0)
        {
            if(answer % 3 == 0 || Integer.toString(answer).contains("3")){
                answer++;
            }else if(answer % 3 != 0 && !Integer.toString(answer).contains("3")){
                answer++;
                count--;
            }
        }

        return answer -1;
    }
}
