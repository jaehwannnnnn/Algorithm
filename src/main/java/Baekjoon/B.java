package Baekjoon;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();
        int count =0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                count++;
            }
        }
        System.out.println(count);
    }
}
