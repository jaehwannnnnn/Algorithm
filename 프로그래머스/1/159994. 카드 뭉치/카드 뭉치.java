import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        List<String> isCards1 = new ArrayList<>();
        List<String> isCards2 = new ArrayList<>();
        for(int i=0;i<goal.length;i++){
            for(int k=0;k<cards1.length;k++){
                if(goal[i].equals(cards1[k])){
                    isCards1.add(goal[i]);
                }
            }
            for(int j=0;j<cards2.length;j++){
                if(goal[i].equals(cards2[j])){
                    isCards2.add(goal[i]);
                }
            }
        }
        String[] arr1 = isCards1.toArray(new String[0]);
        String[] arr2 = isCards2.toArray(new String[0]);
        int count1 =0;
        int count2 = 0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i].equals(cards1[i])){
                count1++;
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i].equals(cards2[i])){
                count2++;
            }
        }
        if(count1 == arr1.length && count2 == arr2.length){
            answer = "Yes";
        }else{
            answer = "No";
        }
        
        return answer;
    }
}