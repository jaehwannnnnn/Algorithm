package Basic.Day1;

import java.util.Scanner;

public class UpperLowerOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for (int n = 0 ; n < a.length() ; n++){
            char c = a.charAt(n);
            if(c >= 65 & c <= 90){
                answer += Character.toLowerCase(c);
            }else if(c >= 97 & c <= 122)
                answer += Character.toUpperCase(c);
        }
        System.out.println(answer);
    }
}
