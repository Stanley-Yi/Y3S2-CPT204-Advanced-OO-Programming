import org.junit.Test;
import static org.junit.Assert.*;

public class NumSubsTest {
    @Test
    public void testSubsInString() {
        assertEquals(2, NumSubs.numSubs("abcxxxxabc", "abc"));
        assertEquals(10, NumSubs.numSubs("aaaaaaaaaa", "a"));
        assertEquals(5, NumSubs.numSubs("aaaaaaaaaa", "aa")); // test overlap subs
        assertEquals(3, NumSubs.numSubs("ababababababa", "aba")); // test overlap subs
    }
    @Test
    public void testSubsNotInString() {
        assertEquals(0, NumSubs.numSubs("abcdef", "xyz"));
        assertEquals(0, NumSubs.numSubs("abcdef", "cab"));
        assertEquals(0, NumSubs.numSubs("abcdef", "bce"));
    }
    @Test
    public void testEmptyString() {
        assertEquals(0, NumSubs.numSubs("", "a"));
        assertEquals(0, NumSubs.numSubs("", "ab"));
        assertEquals(0, NumSubs.numSubs("", "abc"));
    }
    @Test
    public void testOneCharString() {
        assertEquals(1, NumSubs.numSubs("x", "x"));
        assertEquals(0, NumSubs.numSubs("x", "a"));
        assertEquals(0, NumSubs.numSubs("x", "abc"));
    }
}
