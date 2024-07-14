class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int k = 1; k * (k + 1) / 2 <= n; k++) {
            if ((2 * n) % k == 0) {
                int y = (2 * n) / k - k + 1;
                if (y > 0 && y % 2 == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
