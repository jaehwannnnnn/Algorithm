package Basic.Day18;

public class FivePeople {
    class Solution {
        public String[] solution(String[] names) {
            int groupCount = (names.length + 4) / 5; // 마지막 그룹이 5명 미만이더라도 공간을 확보하기 위해 4를 더해줍니다.
            String[] answer = new String[groupCount];
            int idx = 0;

            for (int i = 0; i < names.length; i += 5) {
                answer[idx++] = names[i];
            }

            return answer;
        }
    }

}
