package Basic.Day8;

public class SequenceQueries2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        int b =0;
        for(int i =0;i<queries.length;i++){
            boolean x=false;
            int min = 10000000;
            for(int j = queries[i][0];j<=queries[i][1];j++){
                if(arr[j]>queries[i][2]){
                    if(min > arr[j]) min = arr[j];
                    x = true;
                }
            }
            if(x){
                answer[b] = min;
                b++;
            }
            else {
                answer[b] = -1;
                b++;
            }

        }
        return answer;
    }
}
