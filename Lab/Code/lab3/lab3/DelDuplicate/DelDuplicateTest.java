import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class DelDuplicateTest {

    @Test
	public void test1(){
        assertEquals("abc", DelDuplicate.delDuplicate("aaabbc"));
    }

    @Test
    public void test2(){
        assertEquals("a", DelDuplicate.delDuplicate("aaaaa"));
    }
}
