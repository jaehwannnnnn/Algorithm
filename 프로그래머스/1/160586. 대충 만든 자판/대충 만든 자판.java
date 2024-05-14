import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        // map에 문자와 해당하는 가장 작은 인덱스를 저장
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char ch = keymap[i].charAt(j);
                if (!map.containsKey(ch)) {
                    map.put(ch, j + 1);
                } else {
                    // 이미 있는 문자인 경우, 더 작은 인덱스로 갱신
                    map.put(ch, Math.min(map.get(ch), j + 1));
                }
            }
        }

        // targets를 순회하면서 answer 값을 계산
        for (int i = 0; i < targets.length; i++) {
            answer[i] = 0; // 초기화
            for (int j = 0; j < targets[i].length(); j++) {
                char ch = targets[i].charAt(j);
                if (map.containsKey(ch)) {
                    answer[i] += map.get(ch); // 누적
                } else {
                    answer[i] = -1; // 맵에 없는 경우 -1로 설정
                    break; // 현재 문자열에 대한 계산 중단
                }
            }
        }

        return answer;
    }
}

