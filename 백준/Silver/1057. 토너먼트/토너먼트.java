import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = 0;
        
        while (num1 != num2) {
            num1 = (num1 + 1) / 2;
            num2 = (num2 + 1) / 2;
            count++;
        }
        System.out.println(count);
    }
}