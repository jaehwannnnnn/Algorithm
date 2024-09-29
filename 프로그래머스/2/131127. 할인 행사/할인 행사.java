import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        List<String> targetList = new ArrayList<>();
        for(int i=0;i<want.length;i++){
            for(int j=0;j<number[i];j++){
                targetList.add(want[i]);
            }
        }
        int idx = 0;
        while(discount.length - idx >= 10){
             List<String> list = new ArrayList<>(targetList);
            for(int i=idx;i<10+idx;i++){
                for(int j=0;j<list.size();j++){
                    if(discount[i].equals(list.get(j))){
                        list.remove(j);
                        break;
                    }
                }
            }
            if(list.isEmpty()) answer++;
            idx++;            
        }
        
        return answer;
    }
}