import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();
            char first = name.charAt(0);
            map.put(first, map.getOrDefault(first, 0) + 1);
        }
        List<Character> list = new ArrayList<>();
        for (char key : map.keySet()) {
            if (map.get(key) >= 5) {
                list.add(key);
            }
        }
        if (list.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i));
            }
        }
    }
}