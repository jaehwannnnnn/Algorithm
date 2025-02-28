class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int delIdx = n - 1;
        int picIdx = n - 1;
        while (delIdx >= 0 || picIdx >= 0) {
            while (delIdx >= 0 && deliveries[delIdx] == 0) delIdx--;
            while (picIdx >= 0 && pickups[picIdx] == 0) picIdx--;
            if (delIdx < 0 && picIdx < 0) break;
            int distance = Math.max(delIdx + 1, picIdx + 1);
            answer += distance * 2;
            int delCap = cap;
            int picCap = cap;
            while (delIdx >= 0 && delCap > 0) {
                if (deliveries[delIdx] > delCap) {
                    deliveries[delIdx] -= delCap;
                    delCap = 0;
                } else {
                    delCap -= deliveries[delIdx];
                    deliveries[delIdx--] = 0;
                }
            }
            while (picIdx >= 0 && picCap > 0) {
                if (pickups[picIdx] > picCap) {
                    pickups[picIdx] -= picCap;
                    picCap = 0;
                } else {
                    picCap -= pickups[picIdx];
                    pickups[picIdx--] = 0;
                }
            }
        }
        return answer;
    }
}
