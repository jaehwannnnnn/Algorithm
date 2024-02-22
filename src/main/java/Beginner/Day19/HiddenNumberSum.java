package Beginner.Day19;

public class HiddenNumberSum {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.split("[a-z]|[A-Z]");
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("")){
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}
