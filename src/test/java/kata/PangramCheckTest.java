package kata;

import org.junit.Test;

import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

public class PangramCheckTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        assertTrue(PangramCheck.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        assertFalse(PangramCheck.check(pangram2));
    }
}
