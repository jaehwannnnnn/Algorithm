package Beginner.Day24;

public class IsParallel {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[1][0] - dots[0][0];
        int y1 = dots[1][1] - dots[0][1];
        int x2 = dots[3][0] - dots[2][0];
        int y2 = dots[3][1] - dots[2][1];
        int x3 = dots[2][0] - dots[0][0];
        int y3 = dots[2][1] - dots[0][1];
        int x4 = dots[3][0] - dots[1][0];
        int y4 = dots[3][1] - dots[1][1];
        int x5 = dots[3][0] - dots[0][0];
        int x6 = dots[2][0] - dots[1][0];
        int y5 = dots[3][1] - dots[0][1];
        int y6 = dots[2][1] - dots[1][1];
        if(isParallel(x1,y1,x2,y2) == true || isParallel(x3,y3,x4,y4) == true || isParallel(x5,y5,x6,y6) == true){
            return 1;
        }else{
            return 0;
        }
    }
    public boolean isParallel(int x1, int y1, int x2, int y2){
        double a = (double)x2 / x1;
        if(y1 * a == (double)y2){
            return true;
        }else{
            return false;
        }

    }
}
