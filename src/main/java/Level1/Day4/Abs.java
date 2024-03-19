package Level1.Day4;

public class Abs {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<signs.length;i++){
            if(signs[i] == false){
                absolutes[i] = -1 * absolutes[i];
            }
        }
        for(int i=0;i<absolutes.length;i++){
            answer += absolutes[i];
        }
        return answer;
    }
}
