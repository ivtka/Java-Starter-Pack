package kata;

public class Isogram {
    public static boolean  isIsogram(String str) {
        return str.chars().map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .distinct().count() == str.length();
    }
}
