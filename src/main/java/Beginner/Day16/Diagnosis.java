package Beginner.Day16;

import java.util.Arrays;

public class Diagnosis {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorted = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            sorted[i] = emergency[i];
        }
        Arrays.sort(sorted);
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = sorted.length - Arrays.binarySearch(sorted, emergency[i]);
        }
        return answer;
    }
}
