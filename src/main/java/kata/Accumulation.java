package kata;

public class Accumulation {
    public static String accumulate(String s) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) builder.append('-');
            builder.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) builder.append(Character.toLowerCase(c));
            i++;
        }
       return builder.toString();
    }
}
