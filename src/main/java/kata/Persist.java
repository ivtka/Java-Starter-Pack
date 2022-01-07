package kata;

public class Persist {
    public static int persistence(long n) {
        if (n < 10) return 0;
        return 1 + persistence(multiplyDigits(n));
    }

    private static long multiplyDigits(long n) {
        if (n < 10) return n;
        return n % 10 * multiplyDigits(n / 10);
    }
}
