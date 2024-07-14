class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        String str1 = Integer.toBinaryString(n);
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) == '1'){
                count++;
            }
        }
        for(int i = n+1;i< n+ Math.pow(2, n+1);i++){
            String str2 = Integer.toBinaryString(i);
            int cnt =0;
            for(int k=0;k<str2.length();k++){
                if(str2.charAt(k) == '1'){
                    cnt++;
                }
            }
            if(cnt == count){
                answer = Integer.parseInt(str2, 2);
                break;
            }
        }
        return answer;
    }
}