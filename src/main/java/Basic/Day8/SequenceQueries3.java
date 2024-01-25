package Basic.Day8;

public class SequenceQueries3 {
    public int[] solution(int[] arr, int[][] queries) {
        int n;
        for(int i=0;i<queries.length;i++){
            n = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = n;

        }
        return arr;
    }
}
