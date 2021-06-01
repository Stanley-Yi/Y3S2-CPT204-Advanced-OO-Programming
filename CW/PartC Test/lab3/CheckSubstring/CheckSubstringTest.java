import org.junit.Test;
import static org.junit.Assert.*;


public class CheckSubstringTest {

    @Test
    public void testCheckSubstringTrue() {
        String input = "abcxxxxabc";
        String subs = "abc";
        int n = 2;
        boolean expected = true;
        CheckSubstring.checkSubstring(input, subs, n);
        assertEquals(expected, CheckSubstring.checkSubstring(input, subs, n));
    }
    @Test
    public void testCheckSubstringFalse() {
        String input = "abcxxxxabc";
        String subs = "abc";
        int n = 3;
        boolean expected = false;
        assertEquals(expected, CheckSubstring.checkSubstring(input, subs, n));
    }
    @Test
    public void testCheckSubstringOverlap() {
        String input = "ababaxxxaba";
        String subs = "aba";
        int n = 3;
        boolean expected = true;
        assertEquals(expected, CheckSubstring.checkSubstring(input, subs, n));
    }
	
	// add more test cases
	
	
	
}
