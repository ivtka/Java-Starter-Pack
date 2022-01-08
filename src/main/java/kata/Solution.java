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
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}
