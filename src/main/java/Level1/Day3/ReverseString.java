package Level1.Day3;

public class ReverseString {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String rev = "";
        for(int i = str.length() -1;i>=0;i--){
            rev = rev +str.charAt(i);
        }
        String[] strarr = rev.split("");
        int[] answer = new int[strarr.length];
        for(int i=0;i<strarr.length;i++){
            answer[i] = Integer.parseInt(strarr[i]);
        }
        return answer;
    }
}
