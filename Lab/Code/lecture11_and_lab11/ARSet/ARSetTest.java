import org.junit.Test;
import static org.junit.Assert.*;

public class ARSetTest {

    @Test
    public void testARSetEquals_1() {
        ARSet<String> set1 = new ARSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        ARSet<String> set2 = new ARSet<>();
        set2.add("b");
        set2.add("c");
        set2.add("a");
        assertEquals(set1, set2);
        set2.add("d");
        assertNotEquals(set1, set2);
    }
	
	// Add your own test cases below
	
	
	
	
	
}
