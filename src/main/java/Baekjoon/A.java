package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;st.hasMoreTokens();i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int num = Integer.parseInt(br.readLine());
        int count  = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            for(int k=i+1;k<arr.length;k++){
                if(arr[i] + arr[k] == num){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
