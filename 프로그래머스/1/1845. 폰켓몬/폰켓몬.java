import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] arr = Arrays.stream(nums).distinct().toArray();
        if(arr.length >= nums.length / 2){
            answer = nums.length/2;
        }else{
            answer = arr.length;
        }
        return answer;
    }
}