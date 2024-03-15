package Beginner.Day25;

import java.util.Arrays;

public class Overlap {
    public int solution(int[][] lines) {
        int[] line = new int[201];

        for(int i = 0; i< lines.length; i++) {
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            for(int j = start; j < end; j++) {
                line[j]++;
            }
        }

        return (int) Arrays.stream(line).filter(i -> i > 1).count();
    }
}
