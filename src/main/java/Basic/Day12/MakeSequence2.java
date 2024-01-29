package Basic.Day12;

import java.util.ArrayList;
import java.util.List;

public class MakeSequence2 {
    public int[] solution(int l, int r) {
        int[] empty = new int[] {-1};
        List<Integer> answer = new ArrayList<>();
        for(int i =l;i<=r;i++){
            int count =0;
            String num = Integer.toString(i);
            String[] nums = num.split("");
            for(int k=0; k<nums.length;k++){
                if(nums[k].equals("0") || nums[k].equals("5")){
                    count++;
                }
            }
            if(count == nums.length){
                answer.add(i);
            }
        }
        if(answer.size() == 0){
            return empty;
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
