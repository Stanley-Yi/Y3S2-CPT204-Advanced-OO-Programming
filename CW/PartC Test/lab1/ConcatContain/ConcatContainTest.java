import org.junit.Test;
import static org.junit.Assert.*;

public class ConcatContainTest {

    @Test
    public void testConcatContain1() {
        int expectedNumOfConcat = 2;
        assertEquals(expectedNumOfConcat, ConcatContain.concatContain("ab", "baba"));
    }

    @Test
    public void testConcatContain2() {
        assertEquals(-1, ConcatContain.concatContain("ab", "abcde"));
    }

    // add more test cases ...



}