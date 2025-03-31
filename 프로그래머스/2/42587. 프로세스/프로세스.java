import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> priorQueue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            queue.offer(i);
            priorQueue.offer(priorities[i]);
        }
        int count = 0;
        while(!queue.isEmpty()) {
            int maxPriority = 0;
            for(int priority : priorQueue) {
                maxPriority = Math.max(maxPriority, priority);
            }
            int currentLoc = queue.poll();
            int currentPrior = priorQueue.poll();
            if(currentPrior < maxPriority) {
                queue.offer(currentLoc);
                priorQueue.offer(currentPrior);
            } else {
                count++;
                if(currentLoc == location) {
                    return count;
                }
            }
        }
        return count;
    }
}