package Baekjoon;

import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

public class Population {
    public static void main(String[] args) {
        // 2차원 배열 생성 예시
        int[][] array = {
                {10, 15, 20},
                {20, 30, 25},
                {40, 22, 10}
        };

        // 수정된 배열 출력
        printModifiedArray(array);
    }

    // 주어진 조건에 따라 수정된 배열을 생성하는 메서드
    public static void printModifiedArray(int[][] array) {
        // 새로운 배열 생성 (기존 배열과 동일한 크기로)
        int[][] modifiedArray = new int[array.length][array[0].length];

        // 기존 배열을 순회하면서 인접한 원소들의 합을 구하고 인접한 원소의 개수로 나눈 몫을 해당 원소에 저장
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int sum = array[i][j];
                int count = 1;

                // 왼쪽에 인접한 열에 대한 처리
                if (j > 0) {
                    sum += array[i][j - 1];
                    count++;
                }

                // 위쪽에 인접한 행에 대한 처리
                if (i > 0) {
                    sum += array[i - 1][j];
                    count++;
                }

                // 오른쪽에 인접한 열에 대한 처리
                if (j < array[i].length - 1) {
                    sum += array[i][j + 1];
                    count++;
                }

                // 아래쪽에 인접한 행에 대한 처리
                if (i < array.length - 1) {
                    sum += array[i + 1][j];
                    count++;
                }

                // 평균 구하기 (나머지는 버림)
                modifiedArray[i][j] = sum / count;
            }
        }

        // 수정된 배열 출력
        for (int[] row : modifiedArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
