import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] answer = new long[T];
        for(int i=0;i<T;i++){
            String[] strarr = br.readLine().split(" ");
            int n = Integer.parseInt(strarr[0]);
            int r = Integer.parseInt(strarr[1]);
            answer[i] = combination(n,r);
        }
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
    private static long combination(int n, int r) {
        int max = Math.max(n, r);
        int min = Math.min(n, r);
        min = Math.min(min, max - min);
        if (min == 0 || max == min) return 1;
        long result = 1;
        for (int i = 0; i < min; i++) {
            result *= (max - i);
            result /= (i + 1);
        }
        return result;
    }
}