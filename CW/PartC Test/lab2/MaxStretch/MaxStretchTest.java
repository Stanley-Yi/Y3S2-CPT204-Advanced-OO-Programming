import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxStretchTest {

    @Test
    public void testSingleMaxStretch() {
        List<Integer> list = Arrays.asList(8, 5, 1, 2, 3, 4, 5, 10);
        assertEquals(6, MaxStretch.maxStretch(list));
    }
	
    @Test
    public void testSingleOverlapMaxStretch() {
        List<Integer> list = Arrays.asList(2, 7, 1, 2, 3, 7);
        assertEquals(5, MaxStretch.maxStretch(list));
    }
    
	// add more test cases
	
	
	
}