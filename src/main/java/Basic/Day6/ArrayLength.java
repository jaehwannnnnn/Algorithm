package Basic.Day6;

public class ArrayLength {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i += 2)
                answer[i] = arr[i] + n;
        } else {
            for (int k = 1; k < arr.length; k += 2)
                answer[k] = arr[k] + n;
        }

        return answer;
    }
}
