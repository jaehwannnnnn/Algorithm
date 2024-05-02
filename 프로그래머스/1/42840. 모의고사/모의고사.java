import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] answer1 = new int[answers.length];
        int[] answer2 = new int[answers.length];
        int[] answer3 = new int[answers.length];

        for (int i = 0; i < answer1.length; i++) {
            answer1[i] = (i % 5) + 1;
        }
        for (int i = 0; i < answer2.length; i++) {
            if (i % 2 == 0) {
                answer2[i] = 2;
            } else if (i % 8 == 1) {
                answer2[i] = 1;
            } else if (i % 8 == 3) {
                answer2[i] = 3;
            } else if (i % 8 == 5) {
                answer2[i] = 4;
            } else if (i % 8 == 7) {
                answer2[i] = 5;
            }
        }
        for (int i = 0; i < answer3.length; i++) {
            if (i % 10 == 0 || i % 10 == 1) {
                answer3[i] = 3;
            } else if (i % 10 == 2 || i % 10 == 3) {
                answer3[i] = 1;
            } else if (i % 10 == 4 || i % 10 == 5) {
                answer3[i] = 2;
            } else if (i % 10 == 6 || i % 10 == 7) {
                answer3[i] = 4;
            } else if (i % 10 == 8 || i % 10 == 9) {
                answer3[i] = 5;
            }
        }

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == answer1[i]) count1++;
            if (answers[i] == answer2[i]) count2++;
            if (answers[i] == answer3[i]) count3++;
        }
        int max = Math.max(Math.max(count1, count2), count3);
        if (count1 == max) answer.add(1);
        if (count2 == max) answer.add(2);
        if (count3 == max) answer.add(3);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
