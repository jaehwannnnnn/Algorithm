package Basic.Day24;

import java.util.Arrays;

public class Rank {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] arr = new int[rank.length];
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                arr[i] = rank[i];
            }else{
                rank[i] =10000;
            }
        }
        Arrays.sort(rank);
        for(int i=0;i<arr.length;i++){
            if(rank[0] == arr[i]){
                answer += 10000 * i;
            }else if(rank[1] == arr[i]){
                answer += 100 *i;
            }else if(rank[2] == arr[i]){
                answer += i;
            }
        }
        return answer;
    }
}
