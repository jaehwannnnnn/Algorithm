package Basic.Day13;

import java.util.ArrayList;
import java.util.List;

public class MakeSequence5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        String str = "";
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<intStrs.length;i++){
            str = intStrs[i].substring(s,s+l);
            int a = Integer.parseInt(str);
            if(a>k){
                list.add(a);
            }

        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
