package Basic.Day5;

public class ConnectNum {
    public int solution(int[] num_list) {
        String str1 = "";
        String str2 = "";
        for(int i=0;i<num_list.length;i++){
            if(num_list[i] % 2 == 1)
                str1 += "" + num_list[i];
            else
                str2 += "" + num_list[i];
        }
        int answer = Integer.parseInt(str1) + Integer.parseInt(str2);

        return answer;
    }
}
