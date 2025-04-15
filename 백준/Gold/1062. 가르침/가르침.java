import java.util.*;

public class Main {
    static int N, K, max = 0;
    static List<String> words = new ArrayList<>();
    static boolean[] learned = new boolean[26];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            words.add(word.substring(4, word.length() - 4)); // "anta", "tica" 제거
        }
        if (K < 5) {
            System.out.println(0);
            return;
        }

        learned[0] = true;
        learned[2] = true;
        learned[8] = true;
        learned[13] = true;
        learned[19] = true;
        dfs(0, 0);
        System.out.println(max);
    }
    static void dfs(int start, int count) {
        if (count == K - 5) {
            int readable = 0;
            for (String word : words) {
                boolean canRead = true;
                for (int i = 0; i < word.length(); i++) {
                    char ch = word.charAt(i);
                    if (!learned[ch - 'a']) {
                        canRead = false;
                        break;
                    }
                }
                if (canRead) readable++;
            }
            max = Math.max(max, readable);
            return;
        }
        for (int i = start; i < 26; i++) {
            if (!learned[i]) {
                learned[i] = true;
                dfs(i + 1, count + 1);
                learned[i] = false;
            }
        }
    }
}
