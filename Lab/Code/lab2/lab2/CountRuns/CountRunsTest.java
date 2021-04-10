import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountRunsTest {
	
	// add test cases
    @Test
    public void testGeneral_1() {
        List<Integer> list = Arrays.asList(1, 2, 2, 2, 3);
        assertEquals(1, CountRuns.countRuns(list));
    }

    @Test
    public void testGeneral_2() {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 5, 5, 6, 2, 6, 6);
        assertEquals(3, CountRuns.countRuns(list));
    }

    @Test
    public void testNo() {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 4);
        assertEquals(0, CountRuns.countRuns(list));
    }
	
}