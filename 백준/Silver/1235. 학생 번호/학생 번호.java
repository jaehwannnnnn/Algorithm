import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] nums = new String[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextLine();
        }
        for (int i = 1; i <= nums[0].length(); i++) {
            boolean isUnique = true;
            Set<String> set = new HashSet<>();
            for (int k = 0; k < nums.length; k++) {
                String str = nums[k].substring(nums[k].length() - i);
                if (!set.add(str)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(i);
                return;
            }
        }
    }
}
