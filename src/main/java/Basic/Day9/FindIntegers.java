package Basic.Day9;

public class FindIntegers {
    public int solution(int[] num_list, int n) {
        boolean x = false;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]==n) x = true;
        }
        if(x) return 1;
        else return 0;

    }
}
