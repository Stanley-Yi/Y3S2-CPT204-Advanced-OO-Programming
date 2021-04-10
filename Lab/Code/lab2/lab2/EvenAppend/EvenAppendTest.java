import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


public class EvenAppendTest {

    @Test
    public void testSingleEven() {
        List<String> list = Arrays.asList("a", "b", "a");
        assertEquals("a", EvenAppend.evenAppend(list));
    }
    @Test
    public void testDoubleEven() {
        List<String> list = Arrays.asList("a", "b", "b", "a", "a", "b", "b");
        assertEquals("bab", EvenAppend.evenAppend(list));
    }
    @Test
    public void testNoEven() {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
        assertEquals("", EvenAppend.evenAppend(list));
    }

	
}
