class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisorsCount = new int[number];
        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= Math.sqrt(i + 1); j++) {
                if ((i + 1) % j == 0) {
                    if (j != (i + 1) / j) {
                        divisorsCount[i] += 2;
                    } else {
                        divisorsCount[i]++;
                    }
                }
            }
        }
        for (int i = 0; i < number; i++) {
            if (divisorsCount[i] > limit) {
                divisorsCount[i] = power;
            }
        }
        for (int i = 0; i < number; i++) {
            answer += divisorsCount[i];
        }
        return answer;
    }
}
