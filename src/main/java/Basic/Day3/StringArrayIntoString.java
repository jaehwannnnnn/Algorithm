package Basic.Day3;

public class StringArrayIntoString {
    public String solution(String[] arr) {
        String answer = "";
        for (int i=0; i < arr.length ;i++){
            answer += arr[i];
        }
        return answer;
    }
}
