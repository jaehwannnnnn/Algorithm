class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int share = n / a;
        int remainder = n % a;
        while(share > 0){
            answer += share * b;
            n = (n / a) * b + n % a;
            share = n / a;
            remainder = n % a;           
        }
        return answer;
    }
}