import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] cranes = new Integer[N];
        for (int i = 0; i < N; i++) cranes[i] = sc.nextInt();
        Arrays.sort(cranes, Collections.reverseOrder());

        int M = sc.nextInt();
        List<Integer> boxes = new ArrayList<>();
        for (int i = 0; i < M; i++) boxes.add(sc.nextInt());
        boxes.sort(Collections.reverseOrder());
        if (boxes.get(0) > cranes[0]) {
            System.out.println(-1);
            return;
        }
        boolean[] moved = new boolean[M];
        int movedCount = 0;
        int time = 0;

        while (movedCount < M) {
            int boxIdx = 0;
            for (int i = 0; i < N; i++) {
                while (boxIdx < M) {
                    if (!moved[boxIdx] && cranes[i] >= boxes.get(boxIdx)) {
                        moved[boxIdx] = true;
                        movedCount++;
                        boxIdx++;
                        break;
                    }
                    boxIdx++;
                }
            }
            time++;
        }
        System.out.println(time);
    }
}
