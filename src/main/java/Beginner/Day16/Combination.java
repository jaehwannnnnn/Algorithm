package Beginner.Day16;

import java.math.BigInteger;

public class Combination {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));

        return answer;
    }
    public BigInteger factorial(int num) {
        if(num <= 1) {
            return BigInteger.ONE;
        } else {
            return factorial(num-1).multiply(new BigInteger("" + num));
        }
    }
}
