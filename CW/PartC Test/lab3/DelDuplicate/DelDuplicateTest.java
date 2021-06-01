import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


public class DelDuplicateTest {

    @Test
    public void testTrueEqualSum() {
        assertEquals("abc", DelDuplicate.delDuplicate("aaabbc"));
    }
    @Test
    public void testFalseEqualSum() {

        assertEquals("a", DelDuplicate.delDuplicate("aaaaa"));
    }



	
	
    
}
