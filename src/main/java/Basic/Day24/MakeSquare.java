package Basic.Day24;

public class MakeSquare { public int[][] solution(int[][] arr) {
    int[][] answer = new int[Math.max(arr.length,arr[0].length)][Math.max(arr.length,arr[0].length)];
    if(arr.length == arr[0].length){
        return arr;
    }else if(arr.length > arr[0].length){
        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr[0].length;k++){
                answer[i][k] = arr[i][k];
            }
            for(int j=arr[0].length;j<answer.length;j++){
                answer[i][j] = 0;
            }
        }
    }else{
        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr[0].length;k++){
                answer[i][k] = arr[i][k];
            }
        }for(int i = arr.length;i<answer.length;i++){
            for(int k=0;k<arr[0].length;k++){
                answer[i][k] = 0;
            }
        }
    }
    return answer;
}
}
