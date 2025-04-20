import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kingPos = sc.next();
        String stonePos = sc.next();
        int n = sc.nextInt();

        int kingX = kingPos.charAt(0) - 'A';
        int kingY = kingPos.charAt(1) - '1';
        int stoneX = stonePos.charAt(0) - 'A';
        int stoneY = stonePos.charAt(1) - '1';

        Map<String, int[]> map = new HashMap<>();
        map.put("R", new int[]{1, 0});
        map.put("L", new int[]{-1, 0});
        map.put("B", new int[]{0, -1});
        map.put("T", new int[]{0, 1});
        map.put("RT", new int[]{1, 1});
        map.put("LT", new int[]{-1, 1});
        map.put("RB", new int[]{1, -1});
        map.put("LB", new int[]{-1, -1});
        for (int i = 0; i < n; i++) {
            String move = sc.next();
            int[] dir = map.get(move);
            int nextKingX = kingX + dir[0];
            int nextKingY = kingY + dir[1];
            if (nextKingX < 0 || nextKingX >= 8 || nextKingY < 0 || nextKingY >= 8) {
                continue;
            }
            if (nextKingX == stoneX && nextKingY == stoneY) {
                int nextStoneX = stoneX + dir[0];
                int nextStoneY = stoneY + dir[1];
                if (nextStoneX < 0 || nextStoneX >= 8 || nextStoneY < 0 || nextStoneY >= 8) {
                    continue;
                }
                stoneX = nextStoneX;
                stoneY = nextStoneY;
            }
            kingX = nextKingX;
            kingY = nextKingY;
        }
        System.out.println((char) (kingX + 'A') + "" + (kingY + 1));
        System.out.println((char) (stoneX + 'A') + "" + (stoneY + 1));
    }
}
