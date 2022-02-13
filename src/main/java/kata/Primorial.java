package kata;

import java.math.BigInteger;

public class Primorial {
    private static final BigInteger ONE = BigInteger.ONE,
            TWO = BigInteger.TWO,
            THREE = TWO.add(ONE);

    public static String numPrimorial(int n) {
        BigInteger p = n >= 1 ? TWO : ONE, x = THREE;
        for (int i = 1; i < n; i++, x = x.nextProbablePrime())
            p = p.multiply(x);
        return p.toString();
    }
}
