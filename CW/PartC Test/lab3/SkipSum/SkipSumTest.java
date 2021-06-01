import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class SkipSumTest {
    @Test
    public void testTrueEqualSum() {

        assertTrue(SkipSum.skipSum(Arrays.asList(2, 5, 10, 6), 12));
        assertFalse(SkipSum.skipSum(Arrays.asList(2, 5, 10, 6), 7));
        assertFalse(SkipSum.skipSum(Arrays.asList(2, 5, 10, 6), 16));
    }

    // add your own test cases




}
