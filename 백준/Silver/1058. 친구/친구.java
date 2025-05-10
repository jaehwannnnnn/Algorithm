import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        char[][] friends = new char[N][N];
        for (int i = 0; i < N; i++) {
            friends[i] = sc.nextLine().toCharArray();
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            Set<Integer> twoFriends = new HashSet<>();
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (friends[i][j] == 'Y') {
                    twoFriends.add(j);
                }
            }
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (friends[i][j] == 'Y') {
                    for (int k = 0; k < N; k++) {
                        if (k == i) continue;
                        if (friends[j][k] == 'Y') {
                            twoFriends.add(k);
                        }
                    }
                }
            }
            max = Math.max(max, twoFriends.size());
        }
        System.out.println(max);
    }
}
