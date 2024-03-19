package Level1.Day3;

public class NumOfPY {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int countp = 0;
        int county =0;
        String[] sarr = s.split("");
        for(int i=0;i<sarr.length;i++){
            if(sarr[i].equals("p")){
                countp++;
            }else if(sarr[i].equals("y")){
                county++;
            }
        }if(countp == county){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
