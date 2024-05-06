import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> sum = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    sum.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        int[] sums = sum.stream().mapToInt(x->x).toArray();
        for(int i=0;i<sums.length;i++){
            if(isPrime(sums[i])){
                answer++;
            }
        }
        return answer;
    }
    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}