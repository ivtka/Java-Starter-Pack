package kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        List<Integer> list = new ArrayList<>();
        for (int k : array) {
            if (isOdd(k)) {
                list.add(k);
            }
        }
        Collections.sort(list);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (isOdd(array[i])) {
                array[i] = list.get(j);
                j++;
            }
        }
        return array;
    }

    public static boolean isOdd(int element) {
        return element % 2 != 0;
    }
}
