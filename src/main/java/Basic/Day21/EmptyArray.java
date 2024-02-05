package Basic.Day21;
import java.util.*;
public class EmptyArray {public int[] solution(int[] arr, boolean[] flag) {
    List<Integer> answer = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
        if (flag[i]) {
            for (int k = 0; k < 2 * arr[i]; k++) {
                answer.add(arr[i]);
            }
        } else {
            for (int j = 0; j < arr[i]; j++) {
                answer.remove(answer.size() - 1);
            }
        }
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
}
}
