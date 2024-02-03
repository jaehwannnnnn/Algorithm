package Basic.Day18;

public class IsSubstring {
    public int solution(String str1, String str2) {
        if(str2.contains(str1)) return 1;
        else return 0;
    }
}
