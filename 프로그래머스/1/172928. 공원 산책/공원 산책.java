class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        // 시작점 'S'를 찾기
        for (int i = 0; i < park.length; i++) {
            for (int k = 0; k < park[i].length(); k++) {
                if (park[i].charAt(k) == 'S') {
                    answer[0] = i;
                    answer[1] = k;
                }
            }
        }
        
        
        for (int i = 0; i < routes.length; i++) {
            int count = 0;
            char direction = routes[i].charAt(0);
            int steps = Character.getNumericValue(routes[i].charAt(2));
            int temp1 = answer[0];
            int temp2 = answer[1];
            if (direction == 'E') {
                for (int j = 0; j < steps; j++) {
                    if (temp2 + 1 < park[temp1].length() && park[temp1].charAt(temp2 + 1) != 'X') {
                        count++;
                        temp2++;
                    }
                }
                if (count == steps) {
                    answer[1] = answer[1] + steps;
                    temp2 = answer[1];
                }
            } else if (direction == 'W') {
                for (int k = 0; k < steps; k++) {
                    if (temp2 - 1 >= 0 && park[temp1].charAt(temp2 - 1) != 'X') {
                        count++;
                        temp2--;
                    }
                }
                if (count == steps) {
                    answer[1] = answer[1] - steps;
                    temp2 = answer[1];
                }
            } else if (direction == 'S') {
                for (int l = 0; l < steps; l++) {
                    if (temp1 + 1 < park.length && park[temp1 + 1].charAt(temp2) != 'X') {
                        count++;
                        temp1++;
                    }
                }
                if (count == steps) {
                    answer[0] = answer[0] + steps;
                    temp1 = answer[0];
                }
            } else if (direction == 'N') {
                for (int m = 0; m < steps; m++) {
                    if (temp1 - 1 >= 0 && park[temp1 - 1].charAt(temp2) != 'X') {
                        count++;
                        temp1--;
                    }
                }
                if (count == steps) {
                    answer[0] = answer[0] - steps;
                    temp1 = answer[0];
                }
            }
        }
        
        return answer;
    }
}
