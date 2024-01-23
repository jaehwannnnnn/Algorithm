package Basic.Day1;

import java.util.Scanner;

public class RepeatedStringOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int m = 1 ; m <= n ; m++){
            System.out.print(str);
        }
    }
}
