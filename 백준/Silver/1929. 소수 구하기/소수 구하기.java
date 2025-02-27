import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");
        int startNum = Integer.parseInt(arr[0]);
        int endNum = Integer.parseInt(arr[1]);
        for(int i=startNum;i<=endNum;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int num){
        if(num < 2){
            return false;
        }else{
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
