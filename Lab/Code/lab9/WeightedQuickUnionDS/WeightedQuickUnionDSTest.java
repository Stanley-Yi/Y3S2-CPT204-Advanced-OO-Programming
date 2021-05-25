import org.junit.Test;
import static org.junit.Assert.*;

public class WeightedQuickUnionDSTest {

    @Test
    public void testWeightedQUDS_1() {
        WeightedQuickUnionDS ds = new WeightedQuickUnionDS(4);
        ds.connect(1, 0);
        assertEquals(true, ds.isConnected(1, 0));
        assertEquals(0, ds.parent(1));
        assertEquals(-2, ds.parent(0));
        ds.connect(3, 2);
        assertEquals(false, ds.isConnected(2, 1));
        ds.connect(3, 1);
        assertEquals(true, ds.isConnected(2, 1));
        assertEquals(0, ds.parent(2));
        assertEquals(4, ds.sizeOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateTest_1() {
        WeightedQuickUnionDS ds = new WeightedQuickUnionDS(5);
        ds.validate(5);
    }
	
	
	// add your own Unit Tests and Integration Tests here
	
	
	
	
	
	
}
