import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[8][8];
        int count = 0;
        for (int i = 0; i < 8; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 8; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && board[i][j] == 'F') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}