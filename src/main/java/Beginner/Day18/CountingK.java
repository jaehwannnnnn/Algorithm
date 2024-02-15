package Beginner.Day18;

public class CountingK {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String a = Integer.toString(k);
        for(int x=i;x<=j;x++){
            String value = Integer.toString(x);
            if(value.contains(a)){
                String[] str = value.split("");
                for(int y=0;y<str.length;y++){
                    if(str[y].equals(a)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
