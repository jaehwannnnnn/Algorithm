import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        Pattern pattern = Pattern.compile("^(100+1+|01)+$");

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
