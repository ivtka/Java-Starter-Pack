package kata;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int x = 0, y = 0;
        for (char c : walk) {
            switch (c) {
                case 'n' -> x++;
                case 's' -> x--;
                case 'w' -> y++;
                case 'e' -> y--;
            }
        }

        return x == 0 && y == 0;
    }
}
