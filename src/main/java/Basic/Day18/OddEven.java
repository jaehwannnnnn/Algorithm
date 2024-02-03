package Basic.Day18;

public class OddEven {
    public int solution(int[] num_list) {
        int oddsum = 0;
        int evensum =0;
        for(int i=0; i<num_list.length; i+=2){
            oddsum += num_list[i];
        }
        for(int i=1; i<num_list.length;i+=2){
            evensum += num_list[i];
        }
        return Math.max(oddsum,evensum);
    }
}
