package kata;

import java.util.stream.IntStream;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) queue.add(0);
        for (int time : customers) {
            queue.add(queue.remove() + time);
        }
        return Collections.max(queue);
    }

    public static long[] productArray(int[] numbers) {
        final long product = IntStream.of(numbers).asLongStream().reduce(1, (x, y) -> x * y);
        return IntStream.of(numbers).mapToLong(x -> product / x).toArray();
    }

    public static String replace(final String s) {
        return s.replaceAll("(?i)[aeiou]", "!");
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_' || s.charAt(i) == '-') {
                sb.append(Character.toUpperCase(s.charAt(i + 1)));
                i += 2;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
