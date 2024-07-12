import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        // A 오름차순 정렬
        Arrays.sort(A);

        // B 내림차순 정렬
        Arrays.sort(B);
        for (int i = 0; i < B.length / 2; i++) {
            int temp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = temp;
        }

        // 각 원소의 곱의 합 계산
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
}
