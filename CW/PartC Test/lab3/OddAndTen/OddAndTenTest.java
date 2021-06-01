import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class OddAndTenTest {
    @Test
    public void testTrueEqualSum() {

        assertTrue(OddAndTen.oddAndTen(Arrays.asList(5, 5, 3)));
        assertFalse(OddAndTen.oddAndTen(Arrays.asList(5, 5, 4)));
        assertTrue(OddAndTen.oddAndTen(Arrays.asList(5, 5, 4, 1)));
    }
	
	
}
