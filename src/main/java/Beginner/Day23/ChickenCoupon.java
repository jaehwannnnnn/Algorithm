package Beginner.Day23;

public class ChickenCoupon {
    public int solution(int chicken) {
        int answer = 0;
        while(chicken >=10){
            int remain = chicken % 10;
            answer += chicken / 10;
            chicken = chicken / 10 + remain;
        }
        return answer;
    }
}
