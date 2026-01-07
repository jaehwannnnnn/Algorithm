import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = -1;
        int count = 0;
        while (n >= 0) {
            if (n % 5 == 0) {
                answer = count + n / 5;
                break;
            }
            n -= 2;
            count++;
        }
        System.out.println(answer);
    }
}
