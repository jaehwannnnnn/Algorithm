package Beginner.Day12;

public class UpperLower {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            if(Character.isUpperCase(my_string.charAt(i))){
                answer += Character.toString(my_string.charAt(i)).toLowerCase();
            }else{
                answer += Character.toString(my_string.charAt(i)).toUpperCase();
            }
        }
        return answer;
    }
}
