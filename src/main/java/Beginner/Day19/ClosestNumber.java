package Beginner.Day19;

import java.util.Arrays;

public class ClosestNumber {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int closest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] - n) < Math.abs(closest - n)) {
                closest = array[i];
            }
        }
        return closest;
    }
}
