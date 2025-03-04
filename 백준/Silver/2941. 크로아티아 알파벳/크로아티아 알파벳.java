import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        String[] croatiaAlphabet = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < croatiaAlphabet.length; i++) {
            if(input.contains(croatiaAlphabet[i])){
                input = input.replace(croatiaAlphabet[i], " ");
            }
        }
        count += input.length();
        System.out.println(count);
    }
}