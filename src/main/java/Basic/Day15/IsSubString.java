package Basic.Day15;

public class IsSubString {
    public int solution(String my_string, String target) {
        int answer = my_string.indexOf(target);
        if(answer == -1) return 0;
        else return 1;
    }
}
