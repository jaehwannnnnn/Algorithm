package Basic.Day17;

public class Find1 {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i=idx;i<arr.length;i++){
            if(arr[i] == 0){
                answer = -1;
                continue;
            }else{
                answer = i;
                break;
            }
        }
        return answer;
    }
}
