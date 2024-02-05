package Basic.Day22;

public class ConditionArray {
    public int solution(int[] arr) {
        int answer = 0;
        for(int i=0;i<arr.length;i++){
            while((arr[i]%2 ==0 && arr[i]>=50)||(arr[i]%2 ==1 && arr[i]<50)){
                for(int k=0;k<arr.length;k++){
                    if(arr[k]>=50 && arr[k] % 2 == 0){
                        arr[k] /= 2;
                    }else if(arr[k] < 50 && arr[k]%2 ==1){
                        arr[k] = arr[k] *2+1;
                    }
                }
                answer++;
            }
        }
        return answer;
    }
}
