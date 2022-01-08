package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals("H!!", Solution.replace("Hi!"));
        assertEquals("!H!! H!!", Solution.replace("!Hi! Hi!"));
        assertEquals("!!!!!", Solution.replace("aeiou"));
        assertEquals("!BCD!", Solution.replace("ABCDE"));
    }
}