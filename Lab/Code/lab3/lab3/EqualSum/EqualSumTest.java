import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class EqualSumTest {
    @Test
    public void testTrueEqualSum() {
        List<Integer> list = Arrays.asList(2, 3, 5);
        assertEquals(true, EqualSum.equalSum(list));
    }
    @Test
    public void testFalseEqualSum() {
        List<Integer> list = Arrays.asList(2, 2, 5);
		assertEquals(false, EqualSum.equalSum(list));
	}
    
	// add your own test cases
	
	
	
	
}
