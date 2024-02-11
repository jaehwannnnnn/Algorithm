package Beginner.Day10;

public class ArraySimilarity {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i=0;i<s1.length;i++){
            for(int k=0;k<s2.length;k++){
                if(s1[i].equals(s2[k])){
                    answer++;
                }
            }
        }
        return answer;
    }
}
