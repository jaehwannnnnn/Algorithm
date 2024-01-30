package Basic.Day15;

public class ChangeString {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.replace("A","C").replace("B","A").replace("C","B");

        answer = str.indexOf(pat);
        if(answer == -1) return 0;
        else return 1;
    }
}
