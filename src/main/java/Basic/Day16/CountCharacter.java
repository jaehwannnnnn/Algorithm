package Basic.Day16;

public class CountCharacter {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i =0 ; i<answer.length;i++){
            answer[i] = 0;
        }
        for(int i=0;i<my_string.length();i++){
            char x = my_string.charAt(i);
            for(int k=0;k<26;k++){
                if(x == (char)k + 65){
                    answer[k] += 1;
                }
            }
        }
        for(int i=0;i<my_string.length();i++){
            char x = my_string.charAt(i);
            for(int k =26 ;k<52;k++){
                if(x == (char)k+ 71){
                    answer[k] += 1;
                }
            }
        }
        return answer;
    }
}
