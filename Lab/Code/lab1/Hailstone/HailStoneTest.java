import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class HailStoneTest {

    @Test
    public void testHailstone() {
        List<Integer> expected = Arrays.asList(5, 16, 8, 4, 2, 1);
        List<Integer> actual = Hailstone.hailstone(5);
        assertEquals(expected, actual);



    }

    @Test
    public void testMaxHailstone() {
        int expectedMax = 16;
        assertEquals(expectedMax, Hailstone.maxHailstone(5));



    }

}
