package kata;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        int[] m = new int[26];
        for (char c : str1.toCharArray()) m[c - 'a']++;
        for (char c : str2.toCharArray())
            if (m[c - 'a'] <= 0) return false;
            else m[c - 'a']--;
        return true;
    }
}
