package Basic.Day10;

public class Convert {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<strArr.length;i+=2){
            answer[i] = strArr[i].toLowerCase();
        }
        for(int j=1; j<strArr.length; j +=2){
            answer[j] = strArr[j].toUpperCase();
        }
        return answer;
    }
}
