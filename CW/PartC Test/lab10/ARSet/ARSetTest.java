import org.junit.Test;
import static org.junit.Assert.*;

public class ARSetTest {

    @Test
    public void testSet_1() {
        ARSet<String> set = new ARSet<>();
        set.add("a");
        assertEquals(true, set.contains("a"));
        assertEquals(1, set.size());
        for (String item : set) {
            System.out.println(item);
        }
    }
	
	// add your own test cases here:
	
	
	
	
	
}
