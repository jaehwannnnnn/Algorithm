package Beginner.Day9;

public class RemoveChar {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter,"");
        return answer;
    }
}
