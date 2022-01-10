package kata;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }

    public static String balancedNum(long number) {

    }
}
