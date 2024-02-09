package Beginner.Day6;

public class ArrayLength {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0;i<strlist.length;i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
