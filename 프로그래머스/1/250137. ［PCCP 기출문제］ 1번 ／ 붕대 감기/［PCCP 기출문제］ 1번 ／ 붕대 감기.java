import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        List <Integer> list = new ArrayList<>();
        int count = 0;
        int temp = health;
        int idx =0;
        for(int i=0;i<=attacks[attacks.length-1][0];i++){
            if(i == attacks[idx][0]){
                temp = temp - attacks[idx++][1];
                count =0;
                if(temp <= 0){
                    answer = -1;
                    temp = -1;
                    list.add(temp);
                    break;
                }else{
                    list.add(temp);
                }
            }else{
                count++;
                if(count < bandage[0]){
                    temp = temp + bandage[1];
                    if(temp >= health){
                        temp = health;
                    }
                    list.add(temp);
                }else if(count == bandage[0]){
                    temp = temp + bandage[1] + bandage[2];
                    count = 0;
                    if(temp >= health){
                        temp = health;
                    }
                    list.add(temp);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        answer = list.get(list.size()-1);
        return answer;
    }
}