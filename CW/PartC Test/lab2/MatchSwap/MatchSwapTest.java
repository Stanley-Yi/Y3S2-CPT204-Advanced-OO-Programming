import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


public class MatchSwapTest {

    @Test
    public void test() {
        assertEquals(Arrays.asList("avocado", "apple"), MatchSwap.matchSwap(Arrays.asList("apple", "avocado")));
        assertEquals(Arrays.asList("ac", "ab", "ae", "ad", "af"), MatchSwap.matchSwap(Arrays.asList("ab", "ac", "ad", "ae", "af")));
        assertEquals(Arrays.asList("aq", "bq", "cq", "ap", "cp", "bp"), MatchSwap.matchSwap(Arrays.asList("ap", "bp", "cp", "aq", "cq", "bq")));
    }
	
	
	
}