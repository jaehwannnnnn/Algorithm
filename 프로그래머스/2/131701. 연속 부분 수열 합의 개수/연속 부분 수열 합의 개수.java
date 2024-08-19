import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> sums = new HashSet<>();

        int[] extendedElements = new int[2 * n];
        for (int i = 0; i < n; i++) {
            extendedElements[i] = elements[i];
            extendedElements[i + n] = elements[i];
        }
        
        for (int length = 1; length <= n; length++) {  
            for (int start = 0; start < n; start++) { 
                int sum = 0;
                for (int i = 0; i < length; i++) {     
                    sum += extendedElements[start + i];
                }
                sums.add(sum);
            }
        }
        
        
        return sums.size();
    }
}
