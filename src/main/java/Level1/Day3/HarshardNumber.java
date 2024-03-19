package Level1.Day3;

public class HarshardNumber {
    public boolean solution(int x) {
        String str = "" +x;
        String[] strarr = str.split("");
        int sum = 0;
        for(int i=0;i<strarr.length;i++){
            sum += Integer.parseInt(strarr[i]);
        }
        if(x % sum == 0){
            return true;
        }
        return false;
    }
}
