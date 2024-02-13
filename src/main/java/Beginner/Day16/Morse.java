package Beginner.Day16;

public class Morse {
    public String solution(String letter) {
        String answer = "abcdefghijklmnopqrstuvwxyz";
        String[] alp = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alps = answer.split("");
        String[] letters = letter.split(" ");
        String[] answers = new String[letters.length];
        for(int i=0;i<letters.length;i++){
            for(int k=0;k<alp.length;k++){
                if(letters[i].equals(alp[k])){
                    answers[i] = alps[k];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<answers.length;i++){
            sb.append(answers[i]);
        }
        return sb.toString();
    }
}
