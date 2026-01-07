import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int K = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st2.nextToken());
        }
        int[] arr = new int[N - K + 1];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < K; j++) {
                sum += temp[i + j];
            }
            arr[i] = sum;
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
