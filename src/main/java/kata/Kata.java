package kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

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

    public static int[] incrementer(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .map(i -> (numbers[i] + i + 1) % 10).toArray();
    }

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;
        int min, max, sum;
        sum = min = max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            if (min > numbers[i]) min = numbers[i];
            if (max < numbers[i]) max = numbers[i];
        }
        return sum - min - max;
    }

    public static String rps(String p1, String p2) {
        if(p1.equals(p2)) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";
    }

    public static String chromosomeCheck(String sperm) {
        return "Congratulations! You're going to have a " + (sperm.contains("Y") ? "son." : "daughter.");
    }

    public static double findUniq(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }

    public static int[] DataReverse(int[] data) {
        int[] bytes = new int[data.length];
        for (int i = data.length - 8, j = 0; i >= 0; i -= 8, j += 8) {
            System.arraycopy(data, i, bytes, j, 8);
        }
        return bytes;
    }
}
