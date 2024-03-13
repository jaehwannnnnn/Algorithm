package Beginner.Day23;

import java.util.Arrays;

public class Rank {


    class Solution {
        public int[] solution(int[][] score) {
            int[] answer = new int[score.length];
            int[] avg = new int[score.length];

            for (int i = 0; i < score.length; i++) {
                avg[i] = (score[i][0] + score[i][1]) / 2;
            }

            int[] arr1 = new int[score.length];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = avg[i];
            }

            Arrays.sort(avg);
            int[][] arr2 = new int[score.length][2];

            for (int i = 0; i < arr2.length; i++) {
                arr2[i][0] = avg[i];
            }

            arr2[0][1] = arr2.length;

            for (int i = 1; i < arr2.length; i++) {
                if (arr2[i][0] == arr2[i - 1][0]) {
                    arr2[i][1] = arr2[i - 1][1] -1;
                } else {
                    arr2[i][1] = arr2.length - i;
                }
            }

            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j][0]) {
                        answer[i] = arr2[j][1];
                    }
                }
            }

            return answer;
        }
    }

}
