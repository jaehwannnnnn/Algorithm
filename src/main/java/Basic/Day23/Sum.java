package Basic.Day23;

import java.math.BigInteger;

public class Sum {public String solution(String a, String b) {
    BigInteger numA = new BigInteger(a);
    BigInteger numB = new BigInteger(b);
    BigInteger sum = numA.add(numB);
    return sum.toString();
}
}
