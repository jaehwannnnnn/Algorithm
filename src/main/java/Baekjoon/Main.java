package Baekjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int mul = num1 * num2 * num3;
        String[] str = Integer.toString(mul).split("");
        int[] count = new int[10];
        for(int i=0;i<count.length;i++){
            count[i] = 0;
        }
        for(int i=0;i<str.length;i++){
            for(int k=0;k<count.length;k++){
                if(Integer.parseInt(str[i]) == k){
                    count[k]++;
                }
            }
        }
        for(int i=0;i<count.length;i++){
            System.out.println(count[i]);
        }
    }
}
