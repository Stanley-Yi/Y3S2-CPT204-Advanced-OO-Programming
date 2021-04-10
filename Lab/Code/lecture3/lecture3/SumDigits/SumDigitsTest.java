import org.junit.Test;
import static org.junit.Assert.*;

public class SumDigitsTest {

    @Test
    public void testSumDigits() {

        assertEquals(6, SumDigits.sumDigits(123));
        assertEquals(45, SumDigits.sumDigits(99999));
        assertEquals(0, SumDigits.sumDigits(0));
        assertEquals(1, SumDigits.sumDigits(1));
        assertEquals(1, SumDigits.sumDigits(10));
        assertEquals(5, SumDigits.sumDigits(101010101));
    }
}
