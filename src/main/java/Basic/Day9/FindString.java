package Basic.Day9;

public class FindString {
    public int solution(String myString, String pat) {
        String str1 = myString.toUpperCase();
        String str2 = pat.toUpperCase();
        boolean answer = str1.contains(str2);
        if(answer) return 1;
        else return 0;
    }
}
