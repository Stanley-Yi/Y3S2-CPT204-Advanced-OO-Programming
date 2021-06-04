import org.junit.Test;
import static org.junit.Assert.*;

public class DurationTest {

    @Test
    public void testDurationEquals_1() {
        Duration d1 = new Duration(1, 2);
        Duration d2 = new Duration(1, 2);
        Object o2 = d2;
        assertEquals(d1, d2);
        assertEquals(d1, o2);
    }

    @Test
    public void testDurationCompareTo_1() {
        Duration d1 = new Duration(2, 5);
        Duration d2 = new Duration(1, 2);
        assertTrue(d1.compareTo(d2) > 0);
        assertTrue(d2.compareTo(d1) < 0);
    }
	
	
	// add your own test cases below
	
	
	
	
	
}
