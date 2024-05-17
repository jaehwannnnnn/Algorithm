import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Stack<Integer>> stklist = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<board.length;i++){
            stklist.add(new Stack<>());
        }
        for(int j=0;j<board.length;j++){
            for(int i=board.length - 1;i>=0;i--){
                if(board[i][j] != 0){
                    stklist.get(j).push(board[i][j]);
                }
            }
        }
        for(int i=0;i<moves.length;i++){
            if(!stklist.get(moves[i]-1).isEmpty()){
                int doll = stklist.get(moves[i] -1).pop();
                if(!stk.isEmpty() && stk.peek() == doll){
                    stk.pop();
                    answer +=2;
                }else{
                    stk.push(doll);
                }
            }    
        }
        return answer;
    }
}