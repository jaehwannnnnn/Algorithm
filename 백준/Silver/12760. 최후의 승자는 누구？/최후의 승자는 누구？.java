import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer>[] players = new ArrayList[N+1];
        int[] scores = new int[N + 1];
        Arrays.fill(scores, 0);
        for (int i = 0; i < players.length; i++) {
            players[i] = new ArrayList<>();
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < M; j++) {
                players[i].add(sc.nextInt());
            }
            Collections.sort(players[i], Collections.reverseOrder());
        }
        for (int i = 0; i < M; i++) {
            List<Integer> scoreList = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= N; j++) {
                list.add(players[j].get(i));
            }
            scoreList = caculateScore(list);
            for (int k = 0; k < scoreList.size(); k++) {
                scores[scoreList.get(k) + 1]++;
            }
        }
        List<Integer> indexes = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                indexes.clear();
                indexes.add(i);
            } else if (scores[i] == max) {
                indexes.add(i);
            }
        }
        for (int i = 0; i < indexes.size(); i++) {
            System.out.print(indexes.get(i) + " ");
        }
    }
    public static List<Integer> caculateScore(List<Integer> scores) {
        List<Integer> maxIndex = new ArrayList<>();
        int maxScore = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (maxScore < scores.get(i)) {
                maxScore = scores.get(i);
            }
        }
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) == maxScore) {
                maxIndex.add(i);
            }
        }
        return maxIndex;
    }
}
