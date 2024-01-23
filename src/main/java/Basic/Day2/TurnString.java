package Basic.Day2;

import java.util.Scanner;

public class TurnString {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    for (int n = 0 ; n < a.length() ; n++){
        System.out.println(a.charAt(n));
    }
}
}
