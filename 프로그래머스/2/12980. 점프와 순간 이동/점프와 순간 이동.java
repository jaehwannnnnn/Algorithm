import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int share = 0;
        int remainder =0;
        while(n != 1){
            share = n / 2;
            remainder = n%2;
            if(remainder == 1){
                ans++;
            }
            n = share;
        }
        
        return ++ans;
    }
}