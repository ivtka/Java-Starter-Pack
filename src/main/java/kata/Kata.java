package kata;

import java.util.ArrayList;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        var diff = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (!contains(b, a[i])) {
                diff.add(a[i]);
            }
        }
        return diff.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean contains(int[] b, int element) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] == element) {
                return true;
            }
        }
        return false;
    }
}
