package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int roomNum = s.nextInt();
        String room = Integer.toString(roomNum);
        room = room.replace("6","9");
        String[] rooms = room.split("");
        int[] count = new int[10];
        for(int i=0;i<count.length;i++){
            count[i] = 0;
        }
        for(int i=0;i<rooms.length;i++){
            for(int k=0;k<count.length;k++){
                if(Integer.parseInt(rooms[i]) == k){
                    count[k]++;
                }
            }
        }
        count[9] = Math.round((float)count[9] / 2);
        Arrays.sort(count);
        System.out.println(count[9]);
    }
}
