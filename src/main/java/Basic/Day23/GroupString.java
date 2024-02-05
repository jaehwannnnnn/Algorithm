package Basic.Day23;

public class GroupString {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        int answer = 0;
        for(int i=0;i<strArr.length;i++){
            count[strArr[i].length()]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>answer){
                answer = count[i];
            }
        }
        return answer;
    }
}
