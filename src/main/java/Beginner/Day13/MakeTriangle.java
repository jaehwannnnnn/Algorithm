package Beginner.Day13;

import java.util.Scanner;

public class MakeTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] answer = new String[n];
        answer[0] ="*";
        for(int i=1;i<n;i++){
            answer[i] = answer[i-1] + "*";
        }
        for(int i=0;i<n;i++){
            System.out.println(answer[i]);
        }
    }
}
