package Basic.Day20;

public class SpecialArray {public int solution(int[][] arr) {
    int answer = 1;
    for(int i=0;i<arr.length;i++){
        for(int k=0;k<arr.length;k++){
            if(arr[i][k] == arr[k][i]){
                continue;
            }else{
                answer =0;
                break;
            }
        }
    }
    return answer;
}
}
