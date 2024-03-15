package Beginner.Day24;

import java.util.Arrays;

public class Sort {
    public int[] solution(int[] numlist, int n) {

        Integer[] indices = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (i1, i2) -> {
            int distanceCompare = Integer.compare(Math.abs(numlist[i1] - n), Math.abs(numlist[i2] - n));
            if (distanceCompare == 0) {
                return Integer.compare(numlist[i2], numlist[i1]);
            }
            return distanceCompare;
        });

        int[] answer = new int[numlist.length];
        for (int i = 0; i < indices.length; i++) {
            answer[i] = numlist[indices[i]];
        }
        return answer;
    }
}
