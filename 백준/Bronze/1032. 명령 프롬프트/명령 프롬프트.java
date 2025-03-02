import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String[] files = new String[T];
        for(int i=0;i<files.length;i++){
            files[i] = sc.nextLine();
        }
        int length = files[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = files[0].charAt(i);
            boolean isSame = true;
            for (int j = 1; j < T; j++) {
                if (files[j].charAt(i) != ch) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                sb.append(ch);
            } else {
                sb.append('?');
            }
        }
        System.out.println(sb);
    }
}