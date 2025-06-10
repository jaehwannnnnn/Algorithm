import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long L = sc.nextLong();
        long W = sc.nextLong();
        long H = sc.nextLong();
        
        double left = 0;
        double right = Math.min(L, Math.min(W, H));
 
        for (int i = 0; i < 100; i++) {
            double mid = (left + right) / 2;
            long count = (long)(L/mid) * (long)(W/mid) * (long)(H/mid);
            if (count >= N) {
                left = mid;
            } else {
                right = mid;
            }
        }
        System.out.println(left);
    }
}