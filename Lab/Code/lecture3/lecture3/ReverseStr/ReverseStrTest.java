import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStrTest {
    @Test
    public void testReverseStr() {
        String str = "abcde";
        assertEquals("edcba", ReverseStr.reverseStr(str));
    }
    @Test
    public void testEmptyStr() {
        String str = "";
        assertEquals("", ReverseStr.reverseStr(str));
    }
    @Test
    public void testSingleCharStr() {
        String str = "a";
        assertEquals("a", ReverseStr.reverseStr(str));
    }
    @Test
    public void testTwoCharStr() {
        String str = "ab";
        assertEquals("ba", ReverseStr.reverseStr(str));
    }
}
