package Basic.Day13;

public class ReverseString {
    public String solution(String my_string, int[][] queries) {
        String answer = "";


        for(int i=0;i<queries.length;i++){
            StringBuffer sb = new StringBuffer(my_string.substring(queries[i][0],queries[i][1]+1));

            my_string = my_string.substring(0,queries[i][0]) + sb.reverse().toString() + my_string.substring(queries[i][1]+1);
        }
        return my_string;
    }
}
