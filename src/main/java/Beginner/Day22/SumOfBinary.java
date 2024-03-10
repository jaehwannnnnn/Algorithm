package Beginner.Day22;

public class SumOfBinary {
    class Solution {
        public String solution(String bin1, String bin2) {
            int dec1 = binToDec(bin1);
            int dec2 = binToDec(bin2);
            int sum = dec1 + dec2;
            String answer = decToBin(sum);
            return answer;
        }
        public int binToDec(String bin){
            String[] binarr = bin.split("");
            int dec =0;
            int idx =0;
            for(int i=binarr.length-1;i>=0;i--){
                if(Integer.parseInt(binarr[i])== 1){
                    dec += Math.pow(2,idx++);
                }else{
                    idx++;
                }
            }
            return dec;
        }
        public String decToBin(int dec){
            int rem = 0;
            String remainder = "";
            if(dec ==0){
                return "0";
            }
            while(dec > 1){
                rem = dec %2;
                dec = dec /2;
                remainder += "" + rem;
            }
            remainder += 1 + "";
            StringBuffer sb = new StringBuffer(remainder);
            String reverse = sb.reverse().toString();
            return reverse;
        }
    }
}
