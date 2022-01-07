package kata;

import java.util.ArrayList;

public class DeadFish {
    public static int[] parse(String data) {
        ArrayList<Integer> list = new ArrayList<>();
        int value = 0;
        for (char c : data.toCharArray()) {
            switch (c) {
                case 'i' -> value++;
                case 'd' -> value--;
                case 's' -> value *= value;
                case 'o' -> list.add(value);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
