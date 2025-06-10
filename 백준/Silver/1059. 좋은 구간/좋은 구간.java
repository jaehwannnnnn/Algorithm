import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < L; i++) {
            S.add(sc.nextInt());
        }
        int n = sc.nextInt();
        S.add(0);
        Collections.sort(S);
        
        int index = 0;
        for (int i = 0; i < S.size(); i++) {
            if (S.get(i) > n) {
                index = i;
                break;
            }
        }
   
        int left = S.get(index - 1);
        int right = S.get(index);
        int count = 0;
        
        for (int A = left + 1; A <= n; A++) {
            for (int B = n; B < right; B++) {
                if (A < B) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}