package Basic.Day11;

public class Length {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum =0;
        if(num_list.length>=11){
            for(int i=0;i<num_list.length;i++){
                sum += num_list[i];
            }
            return sum;
        }else{
            for(int i=0;i<num_list.length;i++){
                answer = answer * num_list[i];
            }
            return answer;
        }
    }
}
