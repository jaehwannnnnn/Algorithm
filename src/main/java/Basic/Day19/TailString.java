package Basic.Day19;

public class TailString {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i =0;i<str_list.length;i++){
            if(str_list[i].contains(ex)){
                str_list[i] = "";
            }
            answer += str_list[i];
        }

        return answer;
    }
}
