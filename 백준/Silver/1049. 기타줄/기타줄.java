import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int minPackagePrice = 1001;
        int minSinglePrice = 1001;
        for(int i = 0; i < M; i++) {
            int packagePrice = sc.nextInt();
            int singlePrice = sc.nextInt();
            minPackagePrice = Math.min(minPackagePrice, packagePrice);
            minSinglePrice = Math.min(minSinglePrice, singlePrice);
        }
        int answer;
        int onlyPackage = ((N + 5) / 6) * minPackagePrice;
        int onlySingle = N * minSinglePrice;
        int mixed = (N / 6) * minPackagePrice + (N % 6) * minSinglePrice;
        answer = Math.min(onlyPackage, Math.min(onlySingle, mixed));
        System.out.println(answer);
    }
}