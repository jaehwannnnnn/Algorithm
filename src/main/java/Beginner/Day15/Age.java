package Beginner.Day15;

public class Age {
    public String solution(int age) {
        String answer = "";
        String strAge = Integer.toString(age);
        String[] strarr = strAge.split("");
        for(int i=0;i<strarr.length;i++){
            if(strarr[i].equals("0")){
                answer += "a";
            }else if(strarr[i].equals("1")){
                answer += "b";
            }else if(strarr[i].equals("2")){
                answer += "c";
            }else if(strarr[i].equals("3")){
                answer += "d";
            }else if(strarr[i].equals("4")){
                answer += "e";
            }else if(strarr[i].equals("5")){
                answer += "f";
            }else if(strarr[i].equals("6")){
                answer += "g";
            }else if(strarr[i].equals("7")){
                answer += "h";
            }else if(strarr[i].equals("8")){
                answer += "i";
            }else if(strarr[i].equals("9")){
                answer += "j";
            }
        }
        return answer;
    }
}
