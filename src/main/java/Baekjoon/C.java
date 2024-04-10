package Baekjoon;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] num = str.split(" ");
        int member = Integer.parseInt(num[0]);
        int max = Integer.parseInt(num[1]);
        int count = 0;
        int[][] arr = new int[2][6];
        for(int i=0;i< arr.length;i++){
            for(int k=0;k<arr[0].length;k++){
                arr[i][k] = 0;
            }
        }
        for (int i = 0; i < member; i++) {
            String strs = s.nextLine();
            String[] numbers = strs.split(" ");
            int gender = Integer.parseInt(numbers[0]);
            int grade = Integer.parseInt(numbers[1]) - 1;
            arr[gender][grade]++;
        }
        for(int i=0;i< arr.length;i++){
            for(int k=0;k<arr[0].length;k++){
                if(arr[i][k] == 0){
                    continue;
                }else{
                    count += Math.ceil((float)arr[i][k] / max);
                }
            }
        }
        System.out.println(count);
    }
}
