import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountRunsTest {
	
	// add test cases
	@Test
    public void test() {
        assertEquals(1, CountRuns.countRuns(Arrays.asList(1, 2, 2, 2, 3)));
        assertEquals(2, CountRuns.countRuns(Arrays.asList(1, 1, 2, 3, 4, 5, 5)));
    }
	
	
}