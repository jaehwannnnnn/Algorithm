package Basic.Day3;

public class CompareValues {
    public int solution(int a, int b) {
        int answer = 0;
        String str = ""+a+b;
        int x = 2*a*b;
        return Math.max(Integer.parseInt(str),x);
    }
}
