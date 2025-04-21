class Solution {
    public int solution(String word) {
        int answer = 0;
        char[] alpha = {'A','E','I','O','U'};
        int[] weights = {781, 156, 31, 6, 1};
        for (int i = 0; i < word.length(); i++) {
            int index = 0;
            for (int j = 0; j < alpha.length; j++) {
                if (word.charAt(i) == alpha[j]) {
                    index = j;
                    break;
                }
            }
            answer += index * weights[i] + 1;
        }

        return answer;
    }
}