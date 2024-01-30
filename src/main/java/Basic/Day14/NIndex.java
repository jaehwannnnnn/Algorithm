package Basic.Day14;

public class NIndex {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        for(int i=0;i<=num_list.length-n;i++){
            int a = num_list[i+n -1];
            answer[i] = a;
        }
        return answer;
    }
}
