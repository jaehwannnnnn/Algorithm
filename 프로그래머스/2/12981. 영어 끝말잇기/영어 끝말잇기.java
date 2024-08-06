import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashSet<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            String previousWord = words[i - 1];

            if (currentWord.length() == 1 || previousWord.charAt(previousWord.length() - 1) != currentWord.charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            if (usedWords.contains(currentWord)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            usedWords.add(currentWord);
        }
        
        return answer;
    }
}
