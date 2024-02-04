package Basic.Day21;

public class SequenceQueries1 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0;i<queries.length;i++){
            for(int k=queries[i][0];k<=queries[i][1];k++){
                arr[k]++;
            }
        }
        return arr;
    }
}
