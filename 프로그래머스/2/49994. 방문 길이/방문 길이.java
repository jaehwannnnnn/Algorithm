import java.util.*;

class Solution {
    public int solution(String dirs) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        char[] dirChars = {'U', 'D', 'R', 'L'};
        int x = 0, y = 0;
        Set<String> visited = new HashSet<>();

        for (char dir : dirs.toCharArray()) {
            int index = "UDRL".indexOf(dir);
            int nx = x + dx[index];
            int ny = y + dy[index];
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }
            String path1 = x + "," + y + "," + nx + "," + ny;
            String path2 = nx + "," + ny + "," + x + "," + y;

            visited.add(path1);
            visited.add(path2);

            x = nx;
            y = ny;
        }
        return visited.size() / 2;
    }
}
