class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        // 초기 위치 설정
        int[] leftPos = {3, 0};  // * 위치
        int[] rightPos = {3, 2}; // # 위치

        // 키패드의 각 숫자의 좌표
        int[][] keypad = {
            {3, 1}, // 0
            {0, 0}, {0, 1}, {0, 2}, // 1, 2, 3
            {1, 0}, {1, 1}, {1, 2}, // 4, 5, 6
            {2, 0}, {2, 1}, {2, 2}, // 7, 8, 9
        };

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                leftPos = keypad[number];
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightPos = keypad[number];
            } else {
                int[] targetPos = keypad[number];
                int leftDist = Math.abs(leftPos[0] - targetPos[0]) + Math.abs(leftPos[1] - targetPos[1]);
                int rightDist = Math.abs(rightPos[0] - targetPos[0]) + Math.abs(rightPos[1] - targetPos[1]);

                if (leftDist < rightDist) {
                    answer.append("L");
                    leftPos = targetPos;
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    rightPos = targetPos;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        leftPos = targetPos;
                    } else {
                        answer.append("R");
                        rightPos = targetPos;
                    }
                }
            }
        }
        
        return answer.toString();
    }
}
