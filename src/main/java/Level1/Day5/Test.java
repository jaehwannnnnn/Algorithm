package Level1.Day5;

public class Test {
    public static int solution(String t, String p) {
        int answer = 0;
        for(int i=0;i<t.length() - p.length();i++){
            String str = t.substring(i,i+p.length());
            if(Integer.parseInt(p)>=Integer.parseInt(str)){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String s1 = "10203";
        String s2 = "15";
        int k = solution(s1,s2);
        System.out.println(k);
    }
}
