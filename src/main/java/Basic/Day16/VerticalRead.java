package Basic.Day16;

public class VerticalRead {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int a = my_string.length()/m;
        char[][] strArr1 = new char[a][m];
        for(int i =0 ;i<a;i++){
            for(int k=0;k<m;k++){
                strArr1[i][k] = my_string.charAt(m*i + k);
            }
        }
        for(int i=0;i<a;i++){
            answer = "" + answer + strArr1[i][c-1];
        }
        return answer;

    }
}
