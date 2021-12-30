package kata;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        var diff = new ArrayList<Integer>();
        for (int j : a) {
            if (!contains(b, j)) {
                diff.add(j);
            }
        }
        return diff.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean contains(int[] b, int element) {
        for (int j : b) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }

    public static int[] sortArray(int[] array) {
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 != 0).sorted().toArray();

        for (int index = 0, indexOdd = 0; index < array.length; index++) {
            if (array[index] % 2 != 0) array[index] = sortedOdd[indexOdd++];
        }

        return array;
    }
}
