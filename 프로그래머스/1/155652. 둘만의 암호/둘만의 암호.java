import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] skiparr = skip.toCharArray();
        char[] alpha = new char[26 - skip.length()];
        List<Character> skipped = new ArrayList<>();
        for (int i = 0; i < skiparr.length; i++) {
            skipped.add(skiparr[i]);
        }
        char[] sarr = s.toCharArray();
        char ch = 'a';
        int idx = 0;
        while (ch <= 'z') {
            if (!skipped.contains(ch)) {
                alpha[idx++] = ch;
            }
            ch++;
        }
        for (int i = 0; i < sarr.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (sarr[i] == alpha[j]) {
                    int newIndex = (j + index) % alpha.length;
                    sarr[i] = alpha[newIndex];
                    break; // 문자를 찾았으므로 다음 문자로 이동
                }
            }
        }
        String str = String.valueOf(sarr);
        return str;
    }
}
