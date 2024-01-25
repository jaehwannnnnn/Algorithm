package Basic.Day3;

public class Sum {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = a + "" + b;
        String str2 = b + "" + a;

        if(Integer.parseInt(str1)>Integer.parseInt(str2))
            answer=Integer.parseInt(str1);
        else
            answer=Integer.parseInt(str2);

        return answer;
    }
}
