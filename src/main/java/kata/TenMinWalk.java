package kata;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int nsDirection = 0, ewDirection = 0;
        if (walk.length == 10) {
            for (char act : walk) {
                switch (act) {
                    case 'n' -> nsDirection++;
                    case 's' -> nsDirection--;
                    case 'w' -> ewDirection++;
                    case 'e' -> ewDirection--;
                }
            }
        } else {
            return false;
        }
        return nsDirection == 0 && ewDirection == 0;
    }
}
