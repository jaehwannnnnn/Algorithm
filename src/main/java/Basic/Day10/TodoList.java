package Basic.Day10;
import java.util.*;

public class TodoList {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                answer.add(todo_list[i]);
            }
        }
        int answerSize = answer.size();
        String arr[] = answer.toArray(new String[answerSize]);

        return arr;
    }
}
