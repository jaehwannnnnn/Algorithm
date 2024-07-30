class Solution {
    public int solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        final int MOD = 1234567;
        int p = 0;
        int q = 1;
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            answer = (p + q) % MOD;
            p = q;
            q = answer;
        }

        return answer;
    }
}