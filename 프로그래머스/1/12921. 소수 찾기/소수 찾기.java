class Solution {
    public int solution(int n) {
        if (n < 2) return 0; // 0과 1은 소수가 아님
        
        int count = 0;
        // 짝수는 소수가 아니므로 2를 제외한 나머지 짝수들은 제외
        if (n >= 2) count++;
        
        // 홀수 중에서 소수인지 확인
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    // 소수 판별 메서드
    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
