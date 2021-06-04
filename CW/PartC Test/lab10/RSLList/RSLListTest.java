import org.junit.Test;
import static org.junit.Assert.*;

public class RSLListTest {
    @Test
    public void testRotateRight_1() {
        RSLList<String> rlist = new RSLList<>();
        rlist.addLast("a");
        rlist.addLast("b");
        rlist.addLast("c");
        rlist.rotateRight();
        assertEquals("c", rlist.get(0));
        assertEquals("a", rlist.get(1));
        assertEquals("b", rlist.get(2));
    }
	
	// add your own test cases
	
	
	
	
	
}
