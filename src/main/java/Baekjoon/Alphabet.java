package Baekjoon;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String answer = count(str);
        System.out.println(answer);
    }
    public static String count(String str){
        int[] alps = new int[26];
        for(int i=0;i<alps.length;i++){
            alps[i] = 0;
        }
        String[] strarr = str.split("");
        for(int i=0;i<strarr.length;i++){
            if(strarr[i].equals("a")) alps[0]++;
            if(strarr[i].equals("b")) alps[1]++;
            if(strarr[i].equals("c")) alps[2]++;
            if(strarr[i].equals("d")) alps[3]++;
            if(strarr[i].equals("e")) alps[4]++;
            if(strarr[i].equals("f")) alps[5]++;
            if(strarr[i].equals("g")) alps[6]++;
            if(strarr[i].equals("h")) alps[7]++;
            if(strarr[i].equals("i")) alps[8]++;
            if(strarr[i].equals("j")) alps[9]++;
            if(strarr[i].equals("k")) alps[10]++;
            if(strarr[i].equals("l")) alps[11]++;
            if(strarr[i].equals("m")) alps[12]++;
            if(strarr[i].equals("n")) alps[13]++;
            if(strarr[i].equals("o")) alps[14]++;
            if(strarr[i].equals("p")) alps[15]++;
            if(strarr[i].equals("q")) alps[16]++;
            if(strarr[i].equals("r")) alps[17]++;
            if(strarr[i].equals("s")) alps[18]++;
            if(strarr[i].equals("t")) alps[19]++;
            if(strarr[i].equals("u")) alps[20]++;
            if(strarr[i].equals("v")) alps[21]++;
            if(strarr[i].equals("w")) alps[22]++;
            if(strarr[i].equals("x")) alps[23]++;
            if(strarr[i].equals("y")) alps[24]++;
            if(strarr[i].equals("z")) alps[25]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<alps.length-1;i++){
            sb.append(Integer.toString(alps[i]) + " ");
        }
        sb.append(alps[25]);
        return sb.toString();
    }
}
