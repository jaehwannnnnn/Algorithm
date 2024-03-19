package Level1.Day3;

public class Root {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        if (sqrt == (long) sqrt) {
            return (long) Math.pow(sqrt + 1, 2);
        }
        return -1;
    }
}
