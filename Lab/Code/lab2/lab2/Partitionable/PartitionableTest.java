import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartitionableTest {

    @Test
    public void testPartitionable() {
        List<Integer> list = Arrays.asList(1, 1, 1, 2, 1);
        assertTrue(Partitionable.isPartitionable(list));
		
		
		// add more test cases
		
		
    }
	
    @Test
    public void testNotPartitionable() {
        List<Integer> list = Arrays.asList(2, 1, 1, 2, 1);        
        assertFalse(Partitionable.isPartitionable(list));
		
		// add more test cases
		
		
    }
	
	// add more test cases
	
}