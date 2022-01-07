package kata;

import static java.util.Arrays.stream;

public class FindOdd {
    public static int findIt(int[] arr) {
        int xor = 0;
        for (int j : arr) {
            xor ^= j;
        }
        return xor;
    }
}
