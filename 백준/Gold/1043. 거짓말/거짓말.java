import java.util.*;

public class Main {
    static int[] parent;
    static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            parent[y] = x;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        parent = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }

        int truthNum = sc.nextInt();
        HashSet<Integer> truthPeople = new HashSet<>();
        
        for (int i = 0; i < truthNum; i++) {
            truthPeople.add(sc.nextInt());
        }
        
        ArrayList<ArrayList<Integer>> parties = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int partyNum = sc.nextInt();
            ArrayList<Integer> party = new ArrayList<>();
            
            if (partyNum > 0) {
                int firstPerson = sc.nextInt();
                party.add(firstPerson);
                for (int j = 1; j < partyNum; j++) {
                    int person = sc.nextInt();
                    party.add(person);
                    union(firstPerson, person);
                }
            }
            parties.add(party);
        }

        boolean[] knowsTruth = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            for (int truth : truthPeople) {
                if (find(i) == find(truth)) {
                    knowsTruth[i] = true;
                    break;
                }
            }
        }
 
        int answer = 0;
        for (ArrayList<Integer> party : parties) {
            boolean canLie = true;
            for (int person : party) {
                if (knowsTruth[person]) {
                    canLie = false;
                    break;
                }
            }
            if (canLie) answer++;
        }
        System.out.println(answer);
    }
}