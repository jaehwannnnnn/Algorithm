package Beginner.Day13;

public class Dice {
    public int solution(int[] box, int n) {
        int answer = (box[0] /n)*(box[1]/n)*(box[2]/n);
        return answer;
    }
}
