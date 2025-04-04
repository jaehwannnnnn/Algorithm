import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] serialNumbers = new String[N];
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            serialNumbers[i] = sc.nextLine();
        }
        Arrays.sort(serialNumbers, (x, y) -> {
            if (x.length() != y.length()) {
                return Integer.compare(x.length(), y.length());
            }
            int sumX = numberSum(x);
            int sumY = numberSum(y);

            if (sumX != sumY) {
                return Integer.compare(sumX, sumY);
            }
            
            return x.compareTo(y);
        });
        for (int i = 0; i < serialNumbers.length; i++) {
            System.out.println(serialNumbers[i]);
        }
    }
    public static int numberSum(String str) {
        char[] carr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < carr.length; i++) {
            if (Character.isDigit(carr[i])) {
                sum += carr[i] - '0';
            }
        }
        return sum;
    }
}
