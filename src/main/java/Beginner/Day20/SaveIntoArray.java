package Beginner.Day20;

import java.util.ArrayList;
import java.util.List;

public class SaveIntoArray {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i += n) {
            list.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }
        return list.stream().toArray(String[]::new);
    }
}
