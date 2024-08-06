import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        for(int i=arr[arr.length - 1];i<Integer.MAX_VALUE;i++){
            int count =0;
            for(int k =0;k<arr.length;k++){
                if(i % arr[k] == 0){
                    count++;
                }
            }
            if(count == arr.length){
                answer = i;
                break;
            }
        }
        return answer;
    }
}