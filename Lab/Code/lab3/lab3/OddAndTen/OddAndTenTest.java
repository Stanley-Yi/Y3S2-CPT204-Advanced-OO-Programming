import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class OddAndTenTest {

    @Test
	public void test() {
        assertTrue(OddAndTen.oddAndTen(Arrays.asList(5, 5, 3)));
    }

    @Test
    public void test2() {
        assertFalse(OddAndTen.oddAndTen(Arrays.asList(5, 5, 4)));
    }

    @Test
    public void test3() {
        assertTrue(OddAndTen.oddAndTen(Arrays.asList(5, 5, 4, 1)));
    }
}
