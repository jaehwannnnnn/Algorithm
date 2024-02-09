package Beginner.Day3;

import java.util.Arrays;

public class ModeNumber {
    public int solution(int[] array) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        int[] count = new int[max + 1];
        int top = count[array[0]];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int answer = 0;
        for (int i = 0; i < count.length; i++) {
            if (top < count[i]) {
                top = count[i];
                answer = i;
            } else if (top == count[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}
