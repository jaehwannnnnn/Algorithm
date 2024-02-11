package Beginner.Day15;

public class Game {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        String[] strarr = str.split("");
        for(int i=0;i<strarr.length;i++){
            if(strarr[i].equals("3")||strarr[i].equals("6")||strarr[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}
