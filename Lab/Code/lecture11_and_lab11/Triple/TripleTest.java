import org.junit.Test;
import static org.junit.Assert.*;

public class TripleTest {

    @Test
    public void testDurationCompareTo_1() {
        Triple<Integer, String, Double> t1 = new Triple<>(1, "b", 2.0);
        Triple<Integer, String, Double> t2 = new Triple<>(1, "a", 5.0);
        Triple<Integer, String, Double> t3 = new Triple<>(1, "b", 2.0001);
        assertTrue(t1.compareTo(t2) > 0);
        assertTrue(t1.compareTo(t3) < 0);
    }
	
	// add your own test cases below
	
	
	
	
	
}