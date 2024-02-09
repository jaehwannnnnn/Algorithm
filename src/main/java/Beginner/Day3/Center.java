package Beginner.Day3;

import java.util.Arrays;

public class Center {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length / 2];
        return answer;
    }
}
