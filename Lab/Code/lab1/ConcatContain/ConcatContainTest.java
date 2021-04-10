import org.junit.Test;
import static org.junit.Assert.*;

public class ConcatContainTest {

    @Test
    public void testConcatContain1() {
        int expectedNumOfConcat = 0;
        assertEquals(expectedNumOfConcat, ConcatContain.concatContain("ab", "ab"));
    }

    @Test
    public void testConcatContain2() {
        assertEquals(-1, ConcatContain.concatContain("ab", "abcde"));
    }

    // add more test cases ...



}