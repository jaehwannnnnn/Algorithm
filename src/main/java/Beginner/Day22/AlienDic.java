package Beginner.Day22;

public class AlienDic {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

        for (int i = 0; i < dic.length; i++) {
            int count = 0;
            for (int k = 0; k < spell.length; k++) {
                if (dic[i].contains(spell[k])) {
                    count++;
                }
            }
            if (count == spell.length && dic[i].length() == spell.length) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}
