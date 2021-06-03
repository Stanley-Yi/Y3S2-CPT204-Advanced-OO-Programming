import org.junit.Test;
import static org.junit.Assert.*;

public class ARDequeTest {

    @Test
    public void testLABEXERCISE() {
        ARDeque<String> deque = new ARDeque<>();
        assertTrue(deque.isEmpty());
        assertEquals(0, deque.size());
        assertEquals(4, deque.itemsLength());
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        deque.addLast("d");
        assertEquals(4, deque.size());
        assertEquals(4, deque.itemsLength());
        assertEquals("a", deque.get(0));
        assertEquals("b", deque.get(1));
        assertEquals("c", deque.get(2));
        assertEquals("d", deque.get(3));
        deque.addLast("e");
        assertEquals(5, deque.size());
        assertEquals(8, deque.itemsLength());
        assertEquals("a", deque.get(0));
        assertEquals("d", deque.get(3));
        assertEquals("e", deque.get(4));
    }
	

    @Test
    public void testCopyConstructor() {
        ARDeque<String> deque = new ARDeque<>();
        deque.addFirst("a");
        ARDeque<String> copyDeque = new ARDeque<>(deque);
        deque.addFirst("x");
        copyDeque.addFirst("y");
        assertEquals("x", deque.get(0));
        assertEquals("a", deque.get(1));
        assertEquals("y", copyDeque.get(0));
        assertEquals("a", copyDeque.get(1));
    }

    
    @Test
    public void testGetIndexOutOfBoundsException() {
        ARDeque<String> deque = new ARDeque<>();
        deque.addFirst("a");
        try {
            deque.get(1);
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index 1 is not valid", e.getMessage());
        }
    }
    
	// add your own unit tests,  testing each of your methods separately!
	
	
	
	
	
}
