import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int[] answer = new int[friends.length];
        int[][] gift= new int[friends.length][friends.length];
        Map <String, Integer> giftcount = new HashMap<>();
        for(int i=0;i<gift.length;i++){
            for(int k=0;k<gift.length;k++){
                gift[i][k] = 0;
            }
        }
        for(int i=0;i<gifts.length;i++){
            String[] temp1 = gifts[i].split(" ");
            for(int k=0;k<friends.length;k++){
                for(int j=0;j<friends.length;j++){
                    if(temp1[0].equals(friends[k]) && temp1[1].equals(friends[j])){
                        gift[k][j]++;
                    }
                }
            }
        }
        for(int i=0;i<answer.length;i++){
            answer[i] = 0;
        }
        for(int i=0;i<friends.length;i++){
            giftcount.put(friends[i], 0);
        }
        for(int i=0;i<gifts.length;i++){
            String[] temp2 = gifts[i].split(" ");
            giftcount.put(temp2[0], giftcount.getOrDefault(temp2[0], 0) + 1);
            giftcount.put(temp2[1], giftcount.getOrDefault(temp2[1], 0) - 1);
        }
        for(int i=0;i<gift.length;i++){
            for(int k=0;k<gift.length;k++){
                if(gift[i][k] > gift[k][i]){
                    answer[i]++;
                }else if(gift[i][k] < gift[k][i]){
                    answer[k]++;
                }else{
                    if(giftcount.get(friends[i]) > giftcount.get(friends[k])){
                        answer[i]++;
                    }else if(giftcount.get(friends[i]) < giftcount.get(friends[k])){
                        answer[k]++;
                    }
                }
            }
        }
        Arrays.sort(answer);
        return answer[answer.length - 1] / 2;
    }
}